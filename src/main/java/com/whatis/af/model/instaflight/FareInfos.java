
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "FareInfo"
})
public class FareInfos {

    @JsonProperty("FareInfo")
    private List<FareInfo> FareInfo = new ArrayList<FareInfo>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The FareInfo
     */
    @JsonProperty("FareInfo")
    public List<FareInfo> getFareInfo() {
        return FareInfo;
    }

    /**
     * 
     * @param FareInfo
     *     The FareInfo
     */
    @JsonProperty("FareInfo")
    public void setFareInfo(List<FareInfo> FareInfo) {
        this.FareInfo = FareInfo;
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
