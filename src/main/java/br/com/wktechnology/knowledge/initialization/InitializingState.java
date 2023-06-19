package br.com.wktechnology.knowledge.initialization;

import br.com.wktechnology.knowledge.model.entity.State;
import br.com.wktechnology.knowledge.repository.StateRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class InitializingState {

    @Autowired
    private StateRepository repository;


    @PostConstruct
    public void loadData() {
        createState("AC", "Acre");
        createState("AL", "Alagoas");
        createState("AP", "Amapá");
        createState("AM", "Amazonas");
        createState("BA", "Bahia");
        createState("CE", "Ceará");
        createState("ES", "Espírito Santo");
        createState("GO", "Goiás");
        createState("MA", "Maranhão");
        createState("MT", "Mato Grosso");
        createState("MS", "Mato Grosso do Sul");
        createState("MG", "Minas Gerais");
        createState("PA", "Pará");
        createState("PB", "Paraíba");
        createState("PR", "Paraná");
        createState("PE", "Pernambuco");
        createState("PI", "Piauí");
        createState("RJ", "Rio de Janeiro");
        createState("RN", "Rio Grande do Norte");
        createState("RS", "Rio Grande do Sul");
        createState("RO", "Rondônia");
        createState("RR", "Roraima");
        createState("SC", "Santa Catarina");
        createState("SP", "São Paulo");
        createState("SE", "Sergipe");
        createState("TO", "Tocantins");
        createState("DF", "Distrito Federal");
    }

    private void createState(String uf, String name) {
        Optional<State> stateOptional = repository.findByUf(uf);
        if(stateOptional.isEmpty()) {
            State state = new State();
            state.setUf(uf);
            state.setName(name);
            repository.save(state);
        }
    }

}
