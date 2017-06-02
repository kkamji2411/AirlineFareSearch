
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
    "Source"
})
public class POS {

    @JsonProperty("Source")
    private List<Source> Source = new ArrayList<Source>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Source
     */
    @JsonProperty("Source")
    public List<Source> getSource() {
        return Source;
    }

    /**
     * 
     * @param Source
     *     The Source
     */
    @JsonProperty("Source")
    public void setSource(List<Source> Source) {
        this.Source = Source;
    }

    public POS withSource(List<Source> Source) {
        this.Source = Source;
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

    public POS withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
