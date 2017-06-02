
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "OriginDestinationOptions",
    "DirectionInd"
})
public class AirItinerary {

    @JsonProperty("OriginDestinationOptions")
    private OriginDestinationOptions OriginDestinationOptions;
    @JsonProperty("DirectionInd")
    private String DirectionInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The OriginDestinationOptions
     */
    @JsonProperty("OriginDestinationOptions")
    public OriginDestinationOptions getOriginDestinationOptions() {
        return OriginDestinationOptions;
    }

    /**
     * 
     * @param OriginDestinationOptions
     *     The OriginDestinationOptions
     */
    @JsonProperty("OriginDestinationOptions")
    public void setOriginDestinationOptions(OriginDestinationOptions OriginDestinationOptions) {
        this.OriginDestinationOptions = OriginDestinationOptions;
    }

    /**
     * 
     * @return
     *     The DirectionInd
     */
    @JsonProperty("DirectionInd")
    public String getDirectionInd() {
        return DirectionInd;
    }

    /**
     * 
     * @param DirectionInd
     *     The DirectionInd
     */
    @JsonProperty("DirectionInd")
    public void setDirectionInd(String DirectionInd) {
        this.DirectionInd = DirectionInd;
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
