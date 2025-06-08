package W5l5test.W5l5test;

import W5l5test.W5l5test.Entities.Edificio;

import W5l5test.W5l5test.Entities.Postazione;
import W5l5test.W5l5test.Entities.Utente;
import W5l5test.W5l5test.Repository.EdificioRepository;
import W5l5test.W5l5test.Repository.PostazioneRepository;
import W5l5test.W5l5test.Repository.PrenotazioneRepository;
import W5l5test.W5l5test.Repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


@Component
public class RunnerDB implements CommandLineRunner {

    @Autowired
    private EdificioRepository edificioRepository;

    @Autowired
    private PostazioneRepository postazioneRepository;

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    @Qualifier("edificio1")
    private Edificio edificio1;

    @Autowired
    @Qualifier("edificio2")
    private Edificio edificio2;

    @Autowired
    @Qualifier("edificio3")
    private Edificio edificio3;

    @Autowired
    @Qualifier("PostazioneA")
    private Postazione PostazioneA;

    @Autowired
    @Qualifier("PostazioneB")
    private Postazione PostazioneB;
    @Autowired
    @Qualifier("PostazioneC")
    private Postazione PostazioneC;

    @Autowired
    @Qualifier("PostazioneD")
    private Postazione PostazioneD;

    @Autowired
    @Qualifier("PostazioneE")
    private Postazione PostazioneE;

    @Autowired
    @Qualifier("PostazioneF")
    private Postazione PostazioneF;

    @Autowired
    @Qualifier("PostazioneG")
    private Postazione PostazioneG;

    @Autowired
    @Qualifier("PostazioneH")
    private Postazione PostazioneH;

    @Autowired
    @Qualifier("PostazioneI")
    private Postazione PostazioneI;

    @Autowired
    @Qualifier("utente1")
    private Utente utente1;

    @Autowired
    @Qualifier("utente2")
    private Utente utente2;

    @Autowired
    @Qualifier("utente3")
    private Utente utente3;



    @Override
    public void run(String... args) throws Exception {
        List<Edificio> edificioList = new ArrayList<Edificio>();
        edificioList.add(edificio1);
        edificioList.add(edificio2);
        edificioList.add(edificio3);

        List<Edificio> s = edificioRepository.saveAll(edificioList);

        /* ---------- */

        List<Postazione> postazioneList = new ArrayList<Postazione>();
        postazioneList.add(PostazioneA);
        postazioneList.add(PostazioneB);
        postazioneList.add(PostazioneC);
        postazioneList.add(PostazioneD);
        postazioneList.add(PostazioneE);
        postazioneList.add(PostazioneF);
        postazioneList.add(PostazioneG);
        postazioneList.add(PostazioneH);
        postazioneList.add(PostazioneI);

        List<Postazione> f = postazioneRepository.saveAll(postazioneList);

        /* ---------- */

        List<Utente> utenteList = new ArrayList<Utente>();
        utenteList.add(utente1);
        utenteList.add(utente2);
        utenteList.add(utente3);

        List<Utente> q = utenteRepository.saveAll(utenteList);

        System.out.println("record file:");

    }

}
