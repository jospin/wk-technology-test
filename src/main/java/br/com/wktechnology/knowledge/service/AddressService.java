package br.com.wktechnology.knowledge.service;

import br.com.wktechnology.knowledge.mapper.AddresMapper;
import br.com.wktechnology.knowledge.model.entity.Address;
import br.com.wktechnology.knowledge.model.entity.City;
import br.com.wktechnology.knowledge.repository.AddressRepository;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private final AddresMapper mapper;
    private final AddressRepository repository;
    AddressService(AddresMapper addresMapper, AddressRepository repository) {
        this.mapper = addresMapper;
        this.repository = repository;
    }
    public Address mapperToModel(Candidate candidate, City city) {
        Address address = mapper.toModel(candidate);
        address.setCity(city);
        repository.save(address);
        return address;
    }
}
