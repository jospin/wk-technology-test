package br.com.wktechnology.knowledge.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "address")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String zipcode;
    private String street;
    private String neighborhood;
    @OneToOne(mappedBy = "address")
    private Donator donator;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
