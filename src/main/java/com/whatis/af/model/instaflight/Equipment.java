
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "AirEquipType"
})
public class Equipment {

    @JsonProperty("AirEquipType")
    private String AirEquipType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The AirEquipType
     */
    @JsonProperty("AirEquipType")
    public String getAirEquipType() {
        return AirEquipType;
    }

    /**
     * 
     * @param AirEquipType
     *     The AirEquipType
     */
    @JsonProperty("AirEquipType")
    public void setAirEquipType(String AirEquipType) {
        this.AirEquipType = AirEquipType;
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
