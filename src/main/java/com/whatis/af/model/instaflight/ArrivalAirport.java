
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "LocationCode"
})
public class ArrivalAirport {

    @JsonProperty("LocationCode")
    private String LocationCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The LocationCode
     */
    @JsonProperty("LocationCode")
    public String getLocationCode() {
        return LocationCode;
    }

    /**
     * 
     * @param LocationCode
     *     The LocationCode
     */
    @JsonProperty("LocationCode")
    public void setLocationCode(String LocationCode) {
        this.LocationCode = LocationCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
