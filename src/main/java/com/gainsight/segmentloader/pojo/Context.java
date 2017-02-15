package com.gainsight.segmentloader.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/**
 * Created by samujjal on 15/02/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "library",
        "page",
        "userAgent",
        "ip"
})
public class Context implements Serializable
{

    @JsonProperty("library")
    private Library library;
    @JsonProperty("page")
    private Page page;
    @JsonProperty("userAgent")
    private String userAgent;
    @JsonProperty("ip")
    private String ip;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6439421864063615275L;

    @JsonProperty("library")
    public Library getLibrary() {
        return library;
    }

    @JsonProperty("library")
    public void setLibrary(Library library) {
        this.library = library;
    }

    public Context withLibrary(Library library) {
        this.library = library;
        return this;
    }

    @JsonProperty("page")
    public Page getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Page page) {
        this.page = page;
    }

    public Context withPage(Page page) {
        this.page = page;
        return this;
    }

    @JsonProperty("userAgent")
    public String getUserAgent() {
        return userAgent;
    }

    @JsonProperty("userAgent")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Context withUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    public Context withIp(String ip) {
        this.ip = ip;
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

    public Context withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
