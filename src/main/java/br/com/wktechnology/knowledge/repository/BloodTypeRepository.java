package br.com.wktechnology.knowledge.repository;

import br.com.wktechnology.knowledge.model.entity.BloodType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BloodTypeRepository extends JpaRepository<BloodType, Long> {

    Optional<BloodType> findByBlood(String blood);

}
