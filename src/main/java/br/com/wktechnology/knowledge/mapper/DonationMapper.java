package br.com.wktechnology.knowledge.mapper;

import br.com.wktechnology.knowledge.model.entity.Donator;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import org.springframework.stereotype.Component;

@Component
public class DonationMapper implements Mapper<Donator, Candidate> {

    @Override
    public Donator toModel(Candidate candidate) {
        return Donator.builder()
                .name(candidate.getName())
                .father(candidate.getFather())
                .birthDate(candidate.getBirthDate())
                .height(candidate.getHeight())
                .weight(candidate.getWeight())
                .mother(candidate.getMother())
                .build();
    }

    @Override
    public Candidate toDto(Donator model) {
        return null;
    }
}
