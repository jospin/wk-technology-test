package br.com.wktechnology.knowledge.mapper;

import br.com.wktechnology.knowledge.model.entity.Donator;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import org.springframework.stereotype.Component;

@Component
public class DonationMapper implements Mapper<Donator, Candidate> {

    @Override
    public Donator toModel(Candidate candidate) {
        Donator donator = new Donator();
        donator.setName(candidate.getName());
        donator.setFather(candidate.getFather());
        donator.setBirthDate(candidate.getBirthDate());
        donator.setMother(candidate.getMother());
        donator.setHeight(candidate.getHeight());
        donator.setWeight(candidate.getWeight());
        return donator;
    }

    @Override
    public Candidate toDto(Donator model) {
        return null;
    }
}
