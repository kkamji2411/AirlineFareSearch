
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "PTC_FareBreakdown"
})
public class PTC_FareBreakdowns {

    @JsonProperty("PTC_FareBreakdown")
    private PTC_FareBreakdown PTC_FareBreakdown;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The PTC_FareBreakdown
     */
    @JsonProperty("PTC_FareBreakdown")
    public PTC_FareBreakdown getPTC_FareBreakdown() {
        return PTC_FareBreakdown;
    }

    /**
     * 
     * @param PTC_FareBreakdown
     *     The PTC_FareBreakdown
     */
    @JsonProperty("PTC_FareBreakdown")
    public void setPTC_FareBreakdown(PTC_FareBreakdown PTC_FareBreakdown) {
        this.PTC_FareBreakdown = PTC_FareBreakdown;
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
