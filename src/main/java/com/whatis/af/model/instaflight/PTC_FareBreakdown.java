
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "FareBasisCodes",
    "PassengerTypeQuantity",
    "PassengerFare"
})
public class PTC_FareBreakdown {

    @JsonProperty("FareBasisCodes")
    private FareBasisCodes FareBasisCodes;
    @JsonProperty("PassengerTypeQuantity")
    private PassengerTypeQuantity PassengerTypeQuantity;
    @JsonProperty("PassengerFare")
    private PassengerFare PassengerFare;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The FareBasisCodes
     */
    @JsonProperty("FareBasisCodes")
    public FareBasisCodes getFareBasisCodes() {
        return FareBasisCodes;
    }

    /**
     * 
     * @param FareBasisCodes
     *     The FareBasisCodes
     */
    @JsonProperty("FareBasisCodes")
    public void setFareBasisCodes(FareBasisCodes FareBasisCodes) {
        this.FareBasisCodes = FareBasisCodes;
    }

    /**
     * 
     * @return
     *     The PassengerTypeQuantity
     */
    @JsonProperty("PassengerTypeQuantity")
    public PassengerTypeQuantity getPassengerTypeQuantity() {
        return PassengerTypeQuantity;
    }

    /**
     * 
     * @param PassengerTypeQuantity
     *     The PassengerTypeQuantity
     */
    @JsonProperty("PassengerTypeQuantity")
    public void setPassengerTypeQuantity(PassengerTypeQuantity PassengerTypeQuantity) {
        this.PassengerTypeQuantity = PassengerTypeQuantity;
    }

    /**
     * 
     * @return
     *     The PassengerFare
     */
    @JsonProperty("PassengerFare")
    public PassengerFare getPassengerFare() {
        return PassengerFare;
    }

    /**
     * 
     * @param PassengerFare
     *     The PassengerFare
     */
    @JsonProperty("PassengerFare")
    public void setPassengerFare(PassengerFare PassengerFare) {
        this.PassengerFare = PassengerFare;
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
