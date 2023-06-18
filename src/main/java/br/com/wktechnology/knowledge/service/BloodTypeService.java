package br.com.wktechnology.knowledge.service;

import br.com.wktechnology.knowledge.model.entity.BloodType;
import br.com.wktechnology.knowledge.repository.BloodTypeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BloodTypeService {
    private BloodTypeRepository bloodTypeRepository;

    BloodTypeService(BloodTypeRepository bloodTypeRepository) {
        this.bloodTypeRepository = bloodTypeRepository;
    }

    public BloodType getBloodType(String bloodType) {
        Optional<BloodType> bloodTypeOptional = bloodTypeRepository.findByBlood(bloodType);
        if(bloodTypeOptional.isPresent()) {
            return bloodTypeOptional.get();
        }
        throw new RuntimeException("Blood Type is not exist");
    }
}
