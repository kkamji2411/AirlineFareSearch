
package com.whatis.af.model.bargainfindermax;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "IntelliSellTransaction"
})
public class TPAExtensions {

    @JsonProperty("IntelliSellTransaction")
    private IntelliSellTransaction IntelliSellTransaction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The IntelliSellTransaction
     */
    @JsonProperty("IntelliSellTransaction")
    public IntelliSellTransaction getIntelliSellTransaction() {
        return IntelliSellTransaction;
    }

    /**
     * 
     * @param IntelliSellTransaction
     *     The IntelliSellTransaction
     */
    @JsonProperty("IntelliSellTransaction")
    public void setIntelliSellTransaction(IntelliSellTransaction IntelliSellTransaction) {
        this.IntelliSellTransaction = IntelliSellTransaction;
    }

    public TPAExtensions withIntelliSellTransaction(IntelliSellTransaction IntelliSellTransaction) {
        this.IntelliSellTransaction = IntelliSellTransaction;
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

    public TPAExtensions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
