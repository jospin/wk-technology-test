package br.com.wktechnology.knowledge.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Candidates {
    @JsonProperty("nome")
    private String name;
    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("rg")
    private String document;
    @JsonProperty("data_nasc")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;
    @JsonProperty("sexo")
    private String sex;
    @JsonProperty("mae")
    private String mother;
    @JsonProperty("pai")
    private String father;
    @JsonProperty("email")
    private String mail;
    @JsonProperty("cep")
    private String zipcode;
    @JsonProperty("endereco")
    private String address;
    @JsonProperty("numero")
    private Integer number;
    @JsonProperty("bairro")
    private String neighborhood;
    @JsonProperty("cidade")
    private String city;
    @JsonProperty("estado")
    private String state;
    @JsonProperty("telefone_fixo")
    private String phone;
    @JsonProperty("celular")
    private String mobile;
    @JsonProperty("altura")
    private Double height;
    @JsonProperty("peso")
    private Integer weight;
    @JsonProperty("tipo_sanguineo")
    private String bloodType;

}
