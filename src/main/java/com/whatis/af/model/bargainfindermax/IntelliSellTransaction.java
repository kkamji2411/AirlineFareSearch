
package com.whatis.af.model.bargainfindermax;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "RequestType"
})
public class IntelliSellTransaction {

    @JsonProperty("RequestType")
    private RequestType RequestType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The RequestType
     */
    @JsonProperty("RequestType")
    public RequestType getRequestType() {
        return RequestType;
    }

    /**
     * 
     * @param RequestType
     *     The RequestType
     */
    @JsonProperty("RequestType")
    public void setRequestType(RequestType RequestType) {
        this.RequestType = RequestType;
    }

    public IntelliSellTransaction withRequestType(RequestType RequestType) {
        this.RequestType = RequestType;
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

    public IntelliSellTransaction withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
