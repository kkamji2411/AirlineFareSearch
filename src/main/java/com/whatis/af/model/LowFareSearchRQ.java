package com.whatis.af.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.whatis.af.model.bargainfindermax.OriginDestinationInformation;
import com.whatis.af.model.bargainfindermax.PassengerTypeQuantity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sungji on 2017-06-02.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class LowFareSearchRQ implements Serializable {

    @JsonProperty("OriginDestinationInformation")
    private List<OriginDestinationInformation> originDestinationInformation = null;
    @JsonProperty("PassengerTypeQuantity")
    private List<PassengerTypeQuantity> passengerTypeQuantity = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3311743727937992609L;

    @JsonProperty("OriginDestinationInformation")
    public List<OriginDestinationInformation> getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    @JsonProperty("OriginDestinationInformation")
    public void setOriginDestinationInformation(List<OriginDestinationInformation> originDestinationInformation) {
        this.originDestinationInformation = originDestinationInformation;
    }

    @JsonProperty("PassengerTypeQuantity")
    public List<PassengerTypeQuantity> getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    @JsonProperty("PassengerTypeQuantity")
    public void setPassengerTypeQuantity(List<PassengerTypeQuantity> passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

  /*  @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }*/

}
