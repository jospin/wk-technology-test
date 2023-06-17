package br.com.wktechnology.knowledge.mapper;

import br.com.wktechnology.knowledge.model.entity.State;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import org.springframework.stereotype.Component;

@Component
public class StateMapper implements Mapper<State, Candidate> {
    @Override
    public State toModel(Candidate candidate) {
        return State.builder()
                .uf(candidate.getState())
                .build();
    }

    @Override
    public Candidate toDto(State model) {
        return null;
    }
}
