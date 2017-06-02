
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Ind"
})
public class ETicket {

    @JsonProperty("Ind")
    private Boolean Ind;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Ind
     */
    @JsonProperty("Ind")
    public Boolean getInd() {
        return Ind;
    }

    /**
     * 
     * @param Ind
     *     The Ind
     */
    @JsonProperty("Ind")
    public void setInd(Boolean Ind) {
        this.Ind = Ind;
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
