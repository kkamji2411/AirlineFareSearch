
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Cabin"
})
public class Cabin {

    @JsonProperty("Cabin")
    private String Cabin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Cabin
     */
    @JsonProperty("Cabin")
    public String getCabin() {
        return Cabin;
    }

    /**
     * 
     * @param Cabin
     *     The Cabin
     */
    @JsonProperty("Cabin")
    public void setCabin(String Cabin) {
        this.Cabin = Cabin;
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
