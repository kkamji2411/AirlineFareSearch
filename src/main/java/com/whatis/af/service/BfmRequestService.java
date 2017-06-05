package com.whatis.af.service;


import com.whatis.af.model.LowFareSearchRQ;
import com.whatis.af.model.bargainfindermax.BargainFinderMaxRequest;

/**
 * Created by sungji on 2017-06-01.
 */
public interface BfmRequestService {
    public BargainFinderMaxRequest generateRequest();
    public BargainFinderMaxRequest generateRequest(LowFareSearchRQ lowFareSearchRQ);
}
