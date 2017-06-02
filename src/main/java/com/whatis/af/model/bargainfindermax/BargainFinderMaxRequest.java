
package com.whatis.af.model.bargainfindermax;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "OTA_AirLowFareSearchRQ"
})
public class BargainFinderMaxRequest {

    @JsonProperty("OTA_AirLowFareSearchRQ")
    private OTAAirLowFareSearchRQ OTAAirLowFareSearchRQ;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The OTAAirLowFareSearchRQ
     */
    @JsonProperty("OTA_AirLowFareSearchRQ")
    public OTAAirLowFareSearchRQ getOTAAirLowFareSearchRQ() {
        return OTAAirLowFareSearchRQ;
    }

    /**
     * 
     * @param OTAAirLowFareSearchRQ
     *     The OTA_AirLowFareSearchRQ
     */
    @JsonProperty("OTA_AirLowFareSearchRQ")
    public void setOTAAirLowFareSearchRQ(OTAAirLowFareSearchRQ OTAAirLowFareSearchRQ) {
        this.OTAAirLowFareSearchRQ = OTAAirLowFareSearchRQ;
    }

    public BargainFinderMaxRequest withOTAAirLowFareSearchRQ(OTAAirLowFareSearchRQ OTAAirLowFareSearchRQ) {
        this.OTAAirLowFareSearchRQ = OTAAirLowFareSearchRQ;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public BargainFinderMaxRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
