package br.com.wktechnology.knowledge.model.enumerator;

public enum Gender {
    MALE(0, "Masculino"),
    FEMALE(1, "Feminino");
    private int id;
    private String description;
    Gender(int id, String description) {
        this.description = description;
        this.id = id;
    }
}
