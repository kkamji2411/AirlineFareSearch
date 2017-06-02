
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "eTicket"
})
public class TPA_Extensions {

    @JsonProperty("eTicket")
    private ETicket eTicket;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The eTicket
     */
    @JsonProperty("eTicket")
    public ETicket getETicket() {
        return eTicket;
    }

    /**
     * 
     * @param eTicket
     *     The eTicket
     */
    @JsonProperty("eTicket")
    public void setETicket(ETicket eTicket) {
        this.eTicket = eTicket;
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
