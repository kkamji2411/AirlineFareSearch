
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Indicator"
})
public class DivideInParty {

    @JsonProperty("Indicator")
    private Boolean Indicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Indicator
     */
    @JsonProperty("Indicator")
    public Boolean getIndicator() {
        return Indicator;
    }

    /**
     * 
     * @param Indicator
     *     The Indicator
     */
    @JsonProperty("Indicator")
    public void setIndicator(Boolean Indicator) {
        this.Indicator = Indicator;
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
