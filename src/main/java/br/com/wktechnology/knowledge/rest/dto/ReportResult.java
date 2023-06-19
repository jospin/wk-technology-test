package br.com.wktechnology.knowledge.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReportResult {

    @JsonProperty("quantidade")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private int amount;
}
