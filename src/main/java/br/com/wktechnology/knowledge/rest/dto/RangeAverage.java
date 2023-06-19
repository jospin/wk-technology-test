package br.com.wktechnology.knowledge.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RangeAverage {

    @JsonProperty("range-idade")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String range;
    @JsonProperty("media")
    private double average;
}
