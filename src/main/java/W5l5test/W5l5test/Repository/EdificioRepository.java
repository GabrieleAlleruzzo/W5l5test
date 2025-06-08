package W5l5test.W5l5test.Repository;

import W5l5test.W5l5test.Entities.Edificio;
import W5l5test.W5l5test.Entities.Postazione;
import W5l5test.W5l5test.Entities.Prenotazione;
import W5l5test.W5l5test.Enumerations.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EdificioRepository  extends JpaRepository<Edificio, Long> {
    List<Edificio> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);
}
