package br.com.wktechnology.knowledge.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "blood_type")
@NoArgsConstructor
@Getter
@Setter
public class BloodType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String blood;
    @OneToMany(mappedBy = "bloodType")
    private List<Donator> donator;
}
