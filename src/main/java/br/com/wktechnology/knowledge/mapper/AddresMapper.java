package br.com.wktechnology.knowledge.mapper;

import br.com.wktechnology.knowledge.model.entity.Address;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import org.springframework.stereotype.Component;

@Component
public class AddresMapper implements Mapper<Address, Candidate> {
    @Override
    public Address toModel(Candidate candidate) {
        Address address = new Address();
        address.setStreet(candidate.getStreet());
        address.setNumber(candidate.getNumber());
        address.setNeighborhood(candidate.getNeighborhood());
        address.setZipcode(candidate.getZipcode());
        return address;
    }

}
