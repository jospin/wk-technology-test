package br.com.wktechnology.knowledge.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportResult {

    @JsonProperty("quantidade")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int amount;

    @JsonProperty("medias-por-range")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<RangeAverage> rangeAverageList;

    @JsonProperty("media")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private double avg;

}
