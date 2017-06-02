
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
    "Tax"
})
public class Taxes_ {

    @JsonProperty("Tax")
    private List<Tax_> Tax = new ArrayList<Tax_>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Tax
     */
    @JsonProperty("Tax")
    public List<Tax_> getTax() {
        return Tax;
    }

    /**
     * 
     * @param Tax
     *     The Tax
     */
    @JsonProperty("Tax")
    public void setTax(List<Tax_> Tax) {
        this.Tax = Tax;
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
