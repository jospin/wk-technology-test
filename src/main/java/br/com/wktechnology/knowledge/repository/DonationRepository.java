package br.com.wktechnology.knowledge.repository;

import br.com.wktechnology.knowledge.model.entity.Donator;
import br.com.wktechnology.knowledge.model.entity.IMvcCalculate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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
                    "WHERE s.uf = :uf")
    int donationForState(@Param("uf") String uf);

    @Query(nativeQuery = true,
            value = "SELECT " +
                    "CASE " +
                    " WHEN DATEDIFF(year, birth_date ,now()) between 0 and 10 then \"0 - 10\" " +
                    " WHEN DATEDIFF(year, birth_date ,now()) between 10 and 20 then \"10 - 20\" " +
                    " WHEN DATEDIFF(year, birth_date ,now()) between 20 and 30 then \"20 - 30\" " +
                    " WHEN DATEDIFF(year, birth_date ,now()) between 30 and 40 then \"30 - 40\" " +
                    " WHEN DATEDIFF(year, birth_date ,now()) between 40 and 50 then \"40 - 50\" " +
                    " WHEN DATEDIFF(year, birth_date ,now()) between 50 and 60 then \"50 - 60\" " +
                    " WHEN DATEDIFF(year, birth_date ,now()) between 60 and 70 then \"60 - 70\" " +
                    " WHEN DATEDIFF(year, birth_date ,now()) between 70 and 80 then \"70 - 80\" " +
                    "ELSE \"\" " +
                    "END AS range, " +
                    "AVG( weight/weight^2) as average " +
                    "FROM donator " +
                    "GROUP BY range")
    List<IMvcCalculate> imcDonationForAge();

    @Query(nativeQuery = true,
            value = "SELECT " +
                    "AVG(DATEDIFF(hour, birth_date, now()) / 8766) " +
                    "FROM donator " +
                    "INNER JOIN blood_type " +
                    "  ON donator.blood_type_id = blood_type.id " +
                    "WHERE blood_type.blood = :bloodType ")
    double ageAverageForBloodType(@Param("bloodType") String bloodType);
}
