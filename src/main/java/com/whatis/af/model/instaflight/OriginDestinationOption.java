
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
    "FlightSegment",
    "ElapsedTime"
})
public class OriginDestinationOption {

    @JsonProperty("FlightSegment")
    private List<FlightSegment> FlightSegment = new ArrayList<FlightSegment>();
    @JsonProperty("ElapsedTime")
    private Integer ElapsedTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The FlightSegment
     */
    @JsonProperty("FlightSegment")
    public List<FlightSegment> getFlightSegment() {
        return FlightSegment;
    }

    /**
     * 
     * @param FlightSegment
     *     The FlightSegment
     */
    @JsonProperty("FlightSegment")
    public void setFlightSegment(List<FlightSegment> FlightSegment) {
        this.FlightSegment = FlightSegment;
    }

    /**
     * 
     * @return
     *     The ElapsedTime
     */
    @JsonProperty("ElapsedTime")
    public Integer getElapsedTime() {
        return ElapsedTime;
    }

    /**
     * 
     * @param ElapsedTime
     *     The ElapsedTime
     */
    @JsonProperty("ElapsedTime")
    public void setElapsedTime(Integer ElapsedTime) {
        this.ElapsedTime = ElapsedTime;
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
