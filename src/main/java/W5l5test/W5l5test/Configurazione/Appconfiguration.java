package W5l5test.W5l5test.Configurazione;

import W5l5test.W5l5test.Entities.Edificio;
import W5l5test.W5l5test.Entities.Postazione;
import W5l5test.W5l5test.Entities.Utente;
import W5l5test.W5l5test.Enumerations.TipoPostazione;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



@Configuration
@PropertySource("application.properties")
public class Appconfiguration {

    @Bean(name = "edificio1")
    public Edificio getEdificio1() {
        Edificio edificio1 = new Edificio();
        edificio1.setNome("edificio1");
        edificio1.setCitta("Catania");
        edificio1.setIndirizzo("via plebiscito");
        return edificio1;
    }

    @Bean(name = "PostazioneA")
    public Postazione getPostazioneA() {
        Postazione PostazioneA = new Postazione();
        PostazioneA.setCodice("01");
        PostazioneA.setTipo(TipoPostazione.PRIVATO);
        PostazioneA.setDescrizione("ufficio privato");
        PostazioneA.setMaxOccupanti(2);
        //PostazioneA.setEdificio();
        return PostazioneA;
    }

    @Bean(name = "PostazioneC")
    public Postazione getPostazioneC() {
        Postazione PostazioneC = new Postazione();
        PostazioneC.setCodice("03");
        PostazioneC.setTipo(TipoPostazione.SALA_RIUNIONI);
        PostazioneC.setDescrizione("ufficio ospiti");
        PostazioneC.setMaxOccupanti(100);
        return PostazioneC;
    }

    @Bean(name = "PostazioneB")
    public Postazione getPostazioneB() {
        Postazione PostazioneB = new Postazione();
        PostazioneB.setCodice("02");
        PostazioneB.setTipo(TipoPostazione.OPENSPACE);
        PostazioneB.setDescrizione("ufficio giardino");
        PostazioneB.setMaxOccupanti(50);
        return PostazioneB;
    }

    /* ------------------ */

    @Bean(name = "edificio2")
    public Edificio getEdificio2() {
        Edificio edificio2 = new Edificio();
        edificio2.setNome("edificio2");
        edificio2.setCitta("Milano");
        edificio2.setIndirizzo("via lombardo");
        return edificio2;
    }

    @Bean(name = "PostazioneD")
    public Postazione getPostazioneD() {
        Postazione PostazioneD = new Postazione();
        PostazioneD.setCodice("01");
        PostazioneD.setTipo(TipoPostazione.PRIVATO);
        PostazioneD.setDescrizione("ufficio privato");
        PostazioneD.setMaxOccupanti(2);
        //PostazioneA.setEdificio();
        return PostazioneD;
    }

    @Bean(name = "PostazioneE")
    public Postazione getPostazioneE() {
        Postazione PostazioneE = new Postazione();
        PostazioneE.setCodice("03");
        PostazioneE.setTipo(TipoPostazione.SALA_RIUNIONI);
        PostazioneE.setDescrizione("ufficio ospiti");
        PostazioneE.setMaxOccupanti(100);
        return PostazioneE;
    }

    @Bean(name = "PostazioneF")
    public Postazione getPostazioneF() {
        Postazione PostazioneF = new Postazione();
        PostazioneF.setCodice("02");
        PostazioneF.setTipo(TipoPostazione.OPENSPACE);
        PostazioneF.setDescrizione("ufficio giardino");
        PostazioneF.setMaxOccupanti(50);
        return PostazioneF;
    }

    /* ------------------ */

    @Bean(name = "edificio3")
    public Edificio getEdificio3() {
        Edificio edificio3 = new Edificio();
        edificio3.setNome("edificio1");
        edificio3.setCitta("Roma");
        edificio3.setIndirizzo("via colosseo");
        return edificio3;
    }

        @Bean(name = "PostazioneG")
        public Postazione getPostazioneG() {
            Postazione PostazioneG = new Postazione();
            PostazioneG.setCodice("01");
            PostazioneG.setTipo(TipoPostazione.PRIVATO);
            PostazioneG.setDescrizione("ufficio privato");
            PostazioneG.setMaxOccupanti(2);
            //PostazioneA.setEdificio();
            return PostazioneG;

        }

        @Bean(name = "PostazioneH")
        public Postazione getPostazioneH() {
            Postazione PostazioneH = new Postazione();
            PostazioneH.setCodice("03");
            PostazioneH.setTipo(TipoPostazione.SALA_RIUNIONI);
            PostazioneH.setDescrizione("ufficio ospiti");
            PostazioneH.setMaxOccupanti(100);
            return PostazioneH;
        }

        @Bean(name = "PostazioneI")
        public Postazione getPostazioneI() {
            Postazione PostazioneI = new Postazione();
            PostazioneI.setCodice("02");
            PostazioneI.setTipo(TipoPostazione.OPENSPACE);
            PostazioneI.setDescrizione("ufficio giardino");
            PostazioneI.setMaxOccupanti(50);
            return PostazioneI;
    }

    /* ------------------ */

    @Bean
    public Utente getUtente1 () {
        Utente utente1 = new Utente();
        utente1.setNomeCompleto("Alfredo Panebianco");
        utente1.setUsername("realMeff");
        utente1.setEmail("alfredomeff@gmail.com");
        return utente1;
    }

    @Bean
    public Utente getutente2 () {
        Utente utente2 = new Utente();
        utente2.setNomeCompleto("Federico Vita");
        utente2.setUsername("fedeCoder");
        utente2.setEmail("fedecoder@gmail.com");
        return utente2;
    }

    @Bean
    public Utente getutente3 () {
        Utente utente3 = new Utente();
        utente3.setNomeCompleto("Gabriele Alleruzzo");
        utente3.setUsername("gabrielel");
        utente3.setEmail("alleruzzo@gmail.com");
        return utente3;
    }

    /* ------------------ */


}
