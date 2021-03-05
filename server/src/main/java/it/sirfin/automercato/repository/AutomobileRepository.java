package it.sirfin.automercato.repository;

import it.sirfin.automercato.model.Automobile;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomobileRepository
        extends JpaRepository<Automobile, Long> {

    List<Automobile> findByTargaContainsOrModelloContains(String t, String m);
}
