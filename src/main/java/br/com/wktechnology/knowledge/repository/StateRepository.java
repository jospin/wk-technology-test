package br.com.wktechnology.knowledge.repository;

import br.com.wktechnology.knowledge.model.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
    Optional<State> findByUf(String uf);
}
