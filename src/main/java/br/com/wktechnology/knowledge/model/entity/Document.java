package br.com.wktechnology.knowledge.model.entity;

import br.com.wktechnology.knowledge.model.enumerator.DocumentType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "document")
@Getter
@Setter
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;
    private Long documentNumber;
    @ManyToOne
    @JoinColumn(name = "donator_id")
    private Donator donator;

}
