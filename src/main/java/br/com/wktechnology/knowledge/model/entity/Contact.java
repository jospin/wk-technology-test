package br.com.wktechnology.knowledge.model.entity;

import br.com.wktechnology.knowledge.model.enumerator.ContactType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name="contact")
@Getter
@Setter
public class Contact {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ContactType type;
    private String contact;
    @ManyToOne
    @JoinColumn(name="donator_id")
    private Donator donator;


}
