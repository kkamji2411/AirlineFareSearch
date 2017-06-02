
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "GMTOffset"
})
public class ArrivalTimeZone {

    @JsonProperty("GMTOffset")
    private Integer GMTOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The GMTOffset
     */
    @JsonProperty("GMTOffset")
    public Integer getGMTOffset() {
        return GMTOffset;
    }

    /**
     * 
     * @param GMTOffset
     *     The GMTOffset
     */
    @JsonProperty("GMTOffset")
    public void setGMTOffset(Integer GMTOffset) {
        this.GMTOffset = GMTOffset;
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
