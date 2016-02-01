package de.zalando.aruha.nakadi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;

import java.util.List;

public class EventType {

    private String name;

    private String owningApplication;

    private String type;

    private String topic;

    @JsonIgnore
    private final List<ValidationStrategyConfiguration> validationStrategies = Lists.newArrayList();

    @JsonProperty("schema")
    private EventTypeSchema eventTypeSchema;

    public String getName() { return name; }

    public void setName(final String name) { this.name = name; }

    public String getOwningApplication() {
        return owningApplication;
    }

    public void setOwningApplication(String owningApplication) {
        this.owningApplication = owningApplication;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTopic() { return topic; }

    public void setTopic(String topic) { this.topic = topic; }

    public List<ValidationStrategyConfiguration> getValidationStrategies() {
        return validationStrategies;
    }

    public EventTypeSchema getEventTypeSchema() {
        return eventTypeSchema;
    }

    public void setEventTypeSchema(final EventTypeSchema eventTypeSchema) {
        this.eventTypeSchema = eventTypeSchema;
    }
}
