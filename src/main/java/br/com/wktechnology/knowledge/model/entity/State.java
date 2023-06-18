package br.com.wktechnology.knowledge.model.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "state")
@NoArgsConstructor
@Setter
@Getter
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique=true)
    private String uf;
    private String name;
    @OneToMany(mappedBy = "state")
    private List<City> cities;
}
