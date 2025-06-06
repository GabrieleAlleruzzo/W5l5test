package W5l5test.W5l5test.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor

    public class Edificio {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;
        private String indirizzo;
        private String citta;
    }

