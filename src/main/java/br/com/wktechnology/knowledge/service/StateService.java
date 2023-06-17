package br.com.wktechnology.knowledge.service;

import br.com.wktechnology.knowledge.model.entity.State;
import br.com.wktechnology.knowledge.repository.StateRepository;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StateService {

    private final StateRepository stateRepository;

    StateService(StateRepository repository) {
        this.stateRepository = repository;
    }

    public State mapperToModel(Candidate candidate) {
        Optional<State> stateOptional = stateRepository.findByUf(candidate.getState());
        if (stateOptional.isPresent()) {
            return stateOptional.get();
        }
        throw new RuntimeException("Estado inválido");
    }
}
