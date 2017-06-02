
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
    "TotalTax",
    "Tax"
})
public class Taxes {

    @JsonProperty("TotalTax")
    private TotalTax TotalTax;
    @JsonProperty("Tax")
    private List<Tax> Tax = new ArrayList<Tax>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The TotalTax
     */
    @JsonProperty("TotalTax")
    public TotalTax getTotalTax() {
        return TotalTax;
    }

    /**
     * 
     * @param TotalTax
     *     The TotalTax
     */
    @JsonProperty("TotalTax")
    public void setTotalTax(TotalTax TotalTax) {
        this.TotalTax = TotalTax;
    }

    /**
     * 
     * @return
     *     The Tax
     */
    @JsonProperty("Tax")
    public List<Tax> getTax() {
        return Tax;
    }

    /**
     * 
     * @param Tax
     *     The Tax
     */
    @JsonProperty("Tax")
    public void setTax(List<Tax> Tax) {
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
