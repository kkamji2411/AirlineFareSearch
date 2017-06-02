
package com.whatis.af.model.bargainfindermax;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "CompanyName",
    "ID",
    "Type"
})
public class RequestorID {

    @JsonProperty("CompanyName")
    private CompanyName CompanyName;
    @JsonProperty("ID")
    private String ID;
    @JsonProperty("Type")
    private String Type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The CompanyName
     */
    @JsonProperty("CompanyName")
    public CompanyName getCompanyName() {
        return CompanyName;
    }

    /**
     * 
     * @param CompanyName
     *     The CompanyName
     */
    @JsonProperty("CompanyName")
    public void setCompanyName(CompanyName CompanyName) {
        this.CompanyName = CompanyName;
    }

    public RequestorID withCompanyName(CompanyName CompanyName) {
        this.CompanyName = CompanyName;
        return this;
    }

    /**
     * 
     * @return
     *     The ID
     */
    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    /**
     * 
     * @param ID
     *     The ID
     */
    @JsonProperty("ID")
    public void setID(String ID) {
        this.ID = ID;
    }

    public RequestorID withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(String Type) {
        this.Type = Type;
    }

    public RequestorID withType(String Type) {
        this.Type = Type;
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

    public RequestorID withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
