
package com.whatis.af.model.instaflight;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "PTC_FareBreakdowns",
    "FareInfos",
    "TPA_Extensions",
    "ItinTotalFare"
})
public class AirItineraryPricingInfo {

    @JsonProperty("PTC_FareBreakdowns")
    private PTC_FareBreakdowns PTC_FareBreakdowns;
    @JsonProperty("FareInfos")
    private FareInfos FareInfos;
    @JsonProperty("TPA_Extensions")
    private TPA_Extensions___ TPA_Extensions;
    @JsonProperty("ItinTotalFare")
    private ItinTotalFare ItinTotalFare;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The PTC_FareBreakdowns
     */
    @JsonProperty("PTC_FareBreakdowns")
    public PTC_FareBreakdowns getPTC_FareBreakdowns() {
        return PTC_FareBreakdowns;
    }

    /**
     * 
     * @param PTC_FareBreakdowns
     *     The PTC_FareBreakdowns
     */
    @JsonProperty("PTC_FareBreakdowns")
    public void setPTC_FareBreakdowns(PTC_FareBreakdowns PTC_FareBreakdowns) {
        this.PTC_FareBreakdowns = PTC_FareBreakdowns;
    }

    /**
     * 
     * @return
     *     The FareInfos
     */
    @JsonProperty("FareInfos")
    public FareInfos getFareInfos() {
        return FareInfos;
    }

    /**
     * 
     * @param FareInfos
     *     The FareInfos
     */
    @JsonProperty("FareInfos")
    public void setFareInfos(FareInfos FareInfos) {
        this.FareInfos = FareInfos;
    }

    /**
     * 
     * @return
     *     The TPA_Extensions
     */
    @JsonProperty("TPA_Extensions")
    public TPA_Extensions___ getTPA_Extensions() {
        return TPA_Extensions;
    }

    /**
     * 
     * @param TPA_Extensions
     *     The TPA_Extensions
     */
    @JsonProperty("TPA_Extensions")
    public void setTPA_Extensions(TPA_Extensions___ TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }

    /**
     * 
     * @return
     *     The ItinTotalFare
     */
    @JsonProperty("ItinTotalFare")
    public ItinTotalFare getItinTotalFare() {
        return ItinTotalFare;
    }

    /**
     * 
     * @param ItinTotalFare
     *     The ItinTotalFare
     */
    @JsonProperty("ItinTotalFare")
    public void setItinTotalFare(ItinTotalFare ItinTotalFare) {
        this.ItinTotalFare = ItinTotalFare;
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
