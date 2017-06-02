
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "ValidatingCarrier"
})
public class TPA_Extensions_ {

    @JsonProperty("ValidatingCarrier")
    private ValidatingCarrier ValidatingCarrier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ValidatingCarrier
     */
    @JsonProperty("ValidatingCarrier")
    public ValidatingCarrier getValidatingCarrier() {
        return ValidatingCarrier;
    }

    /**
     * 
     * @param ValidatingCarrier
     *     The ValidatingCarrier
     */
    @JsonProperty("ValidatingCarrier")
    public void setValidatingCarrier(ValidatingCarrier ValidatingCarrier) {
        this.ValidatingCarrier = ValidatingCarrier;
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
