package br.com.wktechnology.knowledge.repository;

import br.com.wktechnology.knowledge.model.entity.Donator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends JpaRepository<Donator, Long> {
    @Query(nativeQuery = true,
            value = "SELECT count(*) " +
                    "FROM donator d " +
                    "INNER JOIN address a" +
                    "   ON D.address_id = a.id " +
                    "INNER JOIN city c" +
                    "   ON a.city_id = c.id " +
                    "INNER JOIN state s" +
                    "   ON c.state_id = c.id " +
                    "WHERE s.uf = ?1")
    int donationWforState(String keyword);

}
