
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "TicketType"
})
public class TicketingInfo {

    @JsonProperty("TicketType")
    private String TicketType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The TicketType
     */
    @JsonProperty("TicketType")
    public String getTicketType() {
        return TicketType;
    }

    /**
     * 
     * @param TicketType
     *     The TicketType
     */
    @JsonProperty("TicketType")
    public void setTicketType(String TicketType) {
        this.TicketType = TicketType;
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
