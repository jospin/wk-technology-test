package br.com.wktechnology.knowledge.model.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "state")
@Getter
@Builder
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uf;
    private String name;
    @OneToMany(mappedBy = "state")
    private List<City> cities;
}
