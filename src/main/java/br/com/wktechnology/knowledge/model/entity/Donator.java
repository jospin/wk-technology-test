package br.com.wktechnology.knowledge.model.entity;

import br.com.wktechnology.knowledge.model.enumerator.Gender;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "donator")
@Getter
@Setter
@NoArgsConstructor
public class Donator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "donator")
    @Setter
    private List<Document> documents;
    private LocalDate birthDate;
    @Enumerated(EnumType.ORDINAL)
    @Setter
    private Gender sex;
    private String mother;
    private String father;
    @OneToMany(mappedBy = "donator")
    @Setter
    private List<Contact> contacts;
    @OneToOne
    @JoinColumn(name = "address_id")
    @Setter
    private Address address;
    private Double height;
    private Integer weight;
    @ManyToOne
    @JoinColumn(name = "bloodType_id")
    @Setter
    private BloodType bloodType;


}
