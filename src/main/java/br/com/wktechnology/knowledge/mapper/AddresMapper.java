package br.com.wktechnology.knowledge.mapper;

import br.com.wktechnology.knowledge.model.entity.Address;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import org.springframework.stereotype.Component;

@Component
public class AddresMapper implements Mapper<Address, Candidate> {
    @Override
    public Address toModel(Candidate candidate) {
        return Address.builder()
                .street(candidate.getStreet())
                .number(candidate.getNumber())
                .neighborhood(candidate.getNeighborhood())
                .zipcode(candidate.getZipcode())
                .build();
    }

    @Override
    public Candidate toDto(Address model) {
        return null;
    }
}
