package br.com.wktechnology.knowledge.service;

import br.com.wktechnology.knowledge.mapper.DonationMapper;
import br.com.wktechnology.knowledge.model.entity.Address;
import br.com.wktechnology.knowledge.model.entity.Donator;
import br.com.wktechnology.knowledge.repository.DonationRepository;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DonationService {

    private final DonationMapper mapper;
    private final DonationRepository repository;

    private DonationService(DonationMapper mapper, DonationRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    public Donator mapperToModel(Candidate candidate, Address address) {
        Donator donator = mapper.toModel(candidate);
        donator.setAddress(address);
        return donator;
    }

    public void saveAll(List<Donator> donatorList) {
        repository.saveAll(donatorList);
    }

    public List<Donator> listCandidates() {
        return repository.findAll();
    }
}