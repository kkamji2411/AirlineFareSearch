package com.whatis.af.service;

import com.whatis.af.model.auth.SabreToken;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Class responsible for executing the GET call.
 * @param <RQ> the request domain class.
 */
@Controller
public class GenericRestGetCall {
    
    private static final Logger LOG = LogManager.getLogger(GenericRestGetCall.class);
    
    private String url;

    @Autowired
    private TokenProvider tokenProvider;
    /**
     * Adds interceptors, creates request string with query and sends the request.
     * Returns the response object.
     * @return response object.
     */
    public String doCall() {
        String result = "";
        try {
            URL oUrl = new URL(url);
            // HTTP 접속 구하기
            HttpURLConnection conn = (HttpURLConnection) oUrl.openConnection();

            // 리퀘스트 메소드를 POST로 설정
            conn.setRequestMethod("GET");

            // 연결된 connection 에서 출력도 하도록 설정

            conn.setRequestProperty("Authorization", "Bearer " + tokenProvider.getToken());
            // 응답 내용(BODY) 구하기
            InputStream inputStream = conn.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream), 8 * 1024);
            String line = null;
            StringBuffer buff = new StringBuffer();

            while ((line = in.readLine()) != null) {
                buff.append(line + "\n");
            }
            in.close();
            result = buff.toString().trim();
            // 접속 해제
            conn.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    

}
