
package com.whatis.af.model.bargainfindermax;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "OriginDestinationInformation",
    "POS",
    "TPA_Extensions",
    "TravelerInfoSummary"
})
public class OTAAirLowFareSearchRQ {

    @JsonProperty("OriginDestinationInformation")
    private List<OriginDestinationInformation> OriginDestinationInformation = new ArrayList<OriginDestinationInformation>();
    @JsonProperty("POS")
    private POS POS;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions TPAExtensions;
    @JsonProperty("TravelerInfoSummary")
    private TravelerInfoSummary TravelerInfoSummary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The OriginDestinationInformation
     */
    @JsonProperty("OriginDestinationInformation")
    public List<OriginDestinationInformation> getOriginDestinationInformation() {
        return OriginDestinationInformation;
    }

    /**
     * 
     * @param OriginDestinationInformation
     *     The OriginDestinationInformation
     */
    @JsonProperty("OriginDestinationInformation")
    public void setOriginDestinationInformation(List<OriginDestinationInformation> OriginDestinationInformation) {
        this.OriginDestinationInformation = OriginDestinationInformation;
    }

    public OTAAirLowFareSearchRQ withOriginDestinationInformation(List<OriginDestinationInformation> OriginDestinationInformation) {
        this.OriginDestinationInformation = OriginDestinationInformation;
        return this;
    }

    /**
     * 
     * @return
     *     The POS
     */
    @JsonProperty("POS")
    public POS getPOS() {
        return POS;
    }

    /**
     * 
     * @param POS
     *     The POS
     */
    @JsonProperty("POS")
    public void setPOS(POS POS) {
        this.POS = POS;
    }

    public OTAAirLowFareSearchRQ withPOS(POS POS) {
        this.POS = POS;
        return this;
    }

    /**
     * 
     * @return
     *     The TPAExtensions
     */
    @JsonProperty("TPA_Extensions")
    public TPAExtensions getTPAExtensions() {
        return TPAExtensions;
    }

    /**
     * 
     * @param TPAExtensions
     *     The TPA_Extensions
     */
    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions TPAExtensions) {
        this.TPAExtensions = TPAExtensions;
    }

    public OTAAirLowFareSearchRQ withTPAExtensions(TPAExtensions TPAExtensions) {
        this.TPAExtensions = TPAExtensions;
        return this;
    }

    /**
     * 
     * @return
     *     The TravelerInfoSummary
     */
    @JsonProperty("TravelerInfoSummary")
    public TravelerInfoSummary getTravelerInfoSummary() {
        return TravelerInfoSummary;
    }

    /**
     * 
     * @param TravelerInfoSummary
     *     The TravelerInfoSummary
     */
    @JsonProperty("TravelerInfoSummary")
    public void setTravelerInfoSummary(TravelerInfoSummary TravelerInfoSummary) {
        this.TravelerInfoSummary = TravelerInfoSummary;
    }

    public OTAAirLowFareSearchRQ withTravelerInfoSummary(TravelerInfoSummary TravelerInfoSummary) {
        this.TravelerInfoSummary = TravelerInfoSummary;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public OTAAirLowFareSearchRQ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
