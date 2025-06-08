package W5l5test.W5l5test.Repository;

import W5l5test.W5l5test.Entities.Postazione;
import W5l5test.W5l5test.Entities.Utente;
import W5l5test.W5l5test.Enumerations.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UtenteRepository extends JpaRepository<Utente, Long> {

}