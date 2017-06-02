
package com.whatis.af.model.bargainfindermax;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "PseudoCityCode",
    "RequestorID"
})
public class Source {

    @JsonProperty("PseudoCityCode")
    private String pseudoCityCode;

    @JsonProperty("RequestorID")
    private RequestorID RequestorID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PseudoCityCode")
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    @JsonProperty("PseudoCityCode")
    public void setPseudoCityCode(String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }

    public Source withPseudoCityCode(String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
        return this;
    }

    /**
     * 
     * @return
     *     The RequestorID
     */
    @JsonProperty("RequestorID")
    public RequestorID getRequestorID() {
        return RequestorID;
    }

    /**
     * 
     * @param RequestorID
     *     The RequestorID
     */
    @JsonProperty("RequestorID")
    public void setRequestorID(RequestorID RequestorID) {
        this.RequestorID = RequestorID;
    }

    public Source withRequestorID(RequestorID RequestorID) {
        this.RequestorID = RequestorID;
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

    public Source withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
