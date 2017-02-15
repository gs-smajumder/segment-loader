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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "anonymousId",
        "channel",
        "context",
        "integrations",
        "messageId",
        "receivedAt",
        "sentAt",
        "timestamp",
        "traits",
        "type",
        "userId",
        "version"
})
public class Identify implements Serializable
{

    @JsonProperty("anonymousId")
    private String anonymousId;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("context")
    private Context context;
    @JsonProperty("integrations")
    private Integrations integrations;
    @JsonProperty("messageId")
    private String messageId;
    @JsonProperty("receivedAt")
    private String receivedAt;
    @JsonProperty("sentAt")
    private String sentAt;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("traits")
    private Traits traits;
    @JsonProperty("type")
    private String type;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3925033152163767657L;

    @JsonProperty("anonymousId")
    public String getAnonymousId() {
        return anonymousId;
    }

    @JsonProperty("anonymousId")
    public void setAnonymousId(String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public Identify withAnonymousId(String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Identify withChannel(String channel) {
        this.channel = channel;
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

    public Identify withContext(Context context) {
        this.context = context;
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

    public Identify withIntegrations(Integrations integrations) {
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

    public Identify withMessageId(String messageId) {
        this.messageId = messageId;
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

    public Identify withReceivedAt(String receivedAt) {
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

    public Identify withSentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Identify withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonProperty("traits")
    public Traits getTraits() {
        return traits;
    }

    @JsonProperty("traits")
    public void setTraits(Traits traits) {
        this.traits = traits;
    }

    public Identify withTraits(Traits traits) {
        this.traits = traits;
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

    public Identify withType(String type) {
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

    public Identify withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public Identify withVersion(String version) {
        this.version = version;
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

    public Identify withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}