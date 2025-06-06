package W5l5test.W5l5test.Repository;

import W5l5test.W5l5test.Entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
        boolean existsByUtente_UsernameAndData(String username, LocalDate data);
        boolean existsByPostazione_IdAndData(Long postazioneId, LocalDate data);
}
