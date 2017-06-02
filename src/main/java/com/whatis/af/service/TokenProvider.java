package com.whatis.af.service;

/**
 * Created by sungji on 2017-06-01.
 */
public interface TokenProvider {
    public String getToken();
    public String getTokenExpires();
}
