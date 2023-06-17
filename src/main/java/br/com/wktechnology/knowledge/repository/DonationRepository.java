package br.com.wktechnology.knowledge.repository;

import br.com.wktechnology.knowledge.model.entity.Donator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends JpaRepository<Donator, Long> {

}
