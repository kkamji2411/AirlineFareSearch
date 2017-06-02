package com.whatis.af.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatis.af.model.bargainfindermax.OriginDestinationInformation;
import com.whatis.af.model.bargainfindermax.PassengerTypeQuantity;

import java.util.List;

/**
 * Created by sungji on 2017-06-02.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LowFareSearchRQ {
    @JsonProperty("OriginDestinationInformation")
    private List<OriginDestinationInformation> originDestinationInformationList;
    @JsonProperty("PassengerTypeQuantity")
    private List<PassengerTypeQuantity> passengerTypeQuantityList;

    public List<OriginDestinationInformation> getOriginDestinationInformationList() {
        return originDestinationInformationList;
    }

    public void setOriginDestinationInformationList(List<OriginDestinationInformation> originDestinationInformationList) {
        this.originDestinationInformationList = originDestinationInformationList;
    }

    public List<PassengerTypeQuantity> getPassengerTypeQuantityList() {
        return passengerTypeQuantityList;
    }

    public void setPassengerTypeQuantityList(List<PassengerTypeQuantity> passengerTypeQuantityList) {
        this.passengerTypeQuantityList = passengerTypeQuantityList;
    }
}
