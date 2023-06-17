package br.com.wktechnology.knowledge.repository;

import br.com.wktechnology.knowledge.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
