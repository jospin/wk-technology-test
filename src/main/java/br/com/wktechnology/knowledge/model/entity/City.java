package br.com.wktechnology.knowledge.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "city")
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
    @OneToMany(mappedBy = "city")
    private List<Address> addresses;

}
