package br.com.wktechnology.knowledge.rest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormReport {
    private String uf;
    private AgeGroupEnumerator ageGroup;
    private String bloodType;
}
