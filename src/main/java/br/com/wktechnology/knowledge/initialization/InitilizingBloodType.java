package br.com.wktechnology.knowledge.initialization;

import br.com.wktechnology.knowledge.model.entity.BloodType;
import br.com.wktechnology.knowledge.model.entity.State;
import br.com.wktechnology.knowledge.repository.BloodTypeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class InitilizingBloodType {

    @Autowired
    private BloodTypeRepository repository;

    @PostConstruct
    public void loadData() {
        createBloodType("A+");
        createBloodType("A-");
        createBloodType("B+");
        createBloodType("B-");
        createBloodType("AB+");
        createBloodType("AB-");
        createBloodType("O+");
        createBloodType("O-");
    }

    private void createBloodType(String blood) {
        Optional<BloodType> bloodTypeOptional = repository.findByBlood(blood);
        if (bloodTypeOptional.isEmpty()) {
            BloodType bloodType = new BloodType();
            bloodType.setBlood(blood);
            repository.save(bloodType);
        }
    }
}
