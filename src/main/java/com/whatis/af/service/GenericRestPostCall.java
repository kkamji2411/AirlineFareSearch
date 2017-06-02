package com.whatis.af.service;

import com.whatis.af.interceptor.LoggingRequestInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for executing the POST call.
 * @param <RQ> the request domain class.
 */
@Controller
@Scope("prototype")
public class GenericRestPostCall<RQ> {

    private static final Logger LOG = LogManager.getLogger(GenericRestPostCall.class);
    
    private RQ request; 
    
    private String url;

    @Autowired
    private TokenProvider tokenProvider;
    /**
     * Adds interceptors, creates request string, adds request body and sends the request.
     * Returns the response object.
     //* @param cls Class of the response object.
     * @return response object.
     */
    public String doCall() {
        RestTemplate restTemplate = new RestTemplate();

        ClientHttpRequestInterceptor ri = new LoggingRequestInterceptor();
        List<ClientHttpRequestInterceptor> ris = new ArrayList<ClientHttpRequestInterceptor>();
        ris.add(ri);
        restTemplate.setInterceptors(ris);

        String result = "";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + tokenProvider.getToken());
        headers.add("Accept", "*/*");
        LOG.info("token : "+tokenProvider.getToken());
        HttpEntity<RQ> requestEntity = new HttpEntity<>(request,
                headers);

        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        messageConverters.add(new FormHttpMessageConverter());
        messageConverters.add(new MappingJackson2HttpMessageConverter());
        restTemplate.setMessageConverters(messageConverters);
        //RS callResult = null;
      /*  try {
            //callResult = cls.newInstance();
        } catch (InstantiationException e) {
            LOG.catching(e);
        } catch (IllegalAccessException e) {
            LOG.catching(e);
        }*/
        try {

            ResponseEntity response = restTemplate.postForEntity(url, requestEntity,null, String.class);
            result = response.getBody().toString();
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode().equals(HttpStatus.UNAUTHORIZED)) {
                /*tokenHolder.setInvalid(true);
                context.setFaulty(true);*/
            }
        }
        return result;
    }

    public String doCallUrlConnection(String rq){
        String result = "";
        try {
            URL oUrl = new URL(url);
            // HTTP 접속 구하기
            HttpURLConnection conn = (HttpURLConnection) oUrl.openConnection();

            // 리퀘스트 메소드를 POST로 설정
            conn.setRequestMethod("POST");

            // 연결된 connection 에서 출력도 하도록 설정
            conn.setDoOutput(true);
            conn.setRequestProperty("Authorization", "Bearer " + tokenProvider.getToken());
            conn.setRequestProperty( "Content-Type", "application/json");
            /*conn.setRequestProperty( "Accept-Encoding", "Accept-Encoding: gzip");*/
            // 요청 파라미터 출력
            // - 파라미터는 쿼리 문자열의 형식으로 지정 (ex) 이름=값&이름=값 형식&...
            // - 파라미터의 값으로 한국어 등을 송신하는 경우는 URL 인코딩을 해야 함.
            try (OutputStream out = conn.getOutputStream()) {
                out.write(rq.getBytes());
                out.flush();
                out.close();
            }


            // 응답 내용(BODY) 구하기
            InputStream inputStream = conn.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream),8*1024);
            String line = null;
            StringBuffer buff   = new StringBuffer();

            while ( ( line = in.readLine() ) != null )
            {
                buff.append(line + "\n");
            }
            in.close();
            result = buff.toString().trim();
            // 접속 해제
            conn.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
    
    public void setRequest(RQ request) {
        this.request = request;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
}
