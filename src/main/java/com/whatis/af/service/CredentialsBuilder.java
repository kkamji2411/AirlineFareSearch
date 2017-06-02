package com.whatis.af.service;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * Created by sungji on 2017-06-01.
 */
@Controller
public class CredentialsBuilder {

    @Value("${sabre.clientId}")
    private String  clientId;
    @Value("${sabre.clientSecret}")
    private String  clientSecret;
    /**
     * Constructs the credentials string. It gets the required data from
     * the Configuration module and encodes it as it is described here:
     * @return the encoded credentials to be used in the authentication header.
     */
    public String getCredentialsString() {

        String secret = b64(clientSecret);
        return b64(b64(clientId) + ":" + secret);
    }

    //just a shortcut method
    private String b64(String toEncode) {
        return Base64.encodeBase64String(toEncode.getBytes());
    }
}