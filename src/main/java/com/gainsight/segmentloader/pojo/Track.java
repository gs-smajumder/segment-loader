package com.gainsight.segmentloader.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "anonymousId",
        "context",
        "event",
        "integrations",
        "messageId",
        "properties",
        "receivedAt",
        "sentAt",
        "timestamp",
        "type",
        "userId",
        "originalTimestamp"
})
public class Track implements Serializable
{

    @JsonProperty("anonymousId")
    private String anonymousId;
    @JsonProperty("context")
    private Context context;
    @JsonProperty("event")
    private String event;
    @JsonProperty("integrations")
    private Integrations integrations;
    @JsonProperty("messageId")
    private String messageId;
    @JsonProperty("properties")
    private Properties properties;
    @JsonProperty("receivedAt")
    private String receivedAt;
    @JsonProperty("sentAt")
    private String sentAt;
    @JsonProperty("timestamp")
    private Date timestamp;
    @JsonProperty("type")
    private String type;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("originalTimestamp")
    private String originalTimestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -927202382170725687L;

    @JsonProperty("anonymousId")
    public String getAnonymousId() {
        return anonymousId;
    }

    @JsonProperty("anonymousId")
    public void setAnonymousId(String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public Track withAnonymousId(String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @JsonProperty("context")
    public Context getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(Context context) {
        this.context = context;
    }

    public Track withContext(Context context) {
        this.context = context;
        return this;
    }

    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    public Track withEvent(String event) {
        this.event = event;
        return this;
    }

    @JsonProperty("integrations")
    public Integrations getIntegrations() {
        return integrations;
    }

    @JsonProperty("integrations")
    public void setIntegrations(Integrations integrations) {
        this.integrations = integrations;
    }

    public Track withIntegrations(Integrations integrations) {
        this.integrations = integrations;
        return this;
    }

    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Track withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Track withProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    @JsonProperty("receivedAt")
    public String getReceivedAt() {
        return receivedAt;
    }

    @JsonProperty("receivedAt")
    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    public Track withReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    @JsonProperty("sentAt")
    public String getSentAt() {
        return sentAt;
    }

    @JsonProperty("sentAt")
    public void setSentAt(String sentAt) {
        this.sentAt = sentAt;
    }

    public Track withSentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Track withTimestamp(Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Track withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Track withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("originalTimestamp")
    public String getOriginalTimestamp() {
        return originalTimestamp;
    }

    @JsonProperty("originalTimestamp")
    public void setOriginalTimestamp(String originalTimestamp) {
        this.originalTimestamp = originalTimestamp;
    }

    public Track withOriginalTimestamp(String originalTimestamp) {
        this.originalTimestamp = originalTimestamp;
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

    public Track withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}