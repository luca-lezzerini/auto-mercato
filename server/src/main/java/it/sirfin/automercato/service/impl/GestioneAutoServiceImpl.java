package it.sirfin.automercato.service.impl;

import it.sirfin.automercato.dto.BolloDto;
import it.sirfin.automercato.dto.ListeAutoDto;
import it.sirfin.automercato.model.Automobile;
import it.sirfin.automercato.repository.AutomobileRepository;
import it.sirfin.automercato.service.GestioneAutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestioneAutoServiceImpl implements GestioneAutoService {

    @Autowired
    AutomobileRepository automobileRepository;

    @Override
    public ListeAutoDto inserisciAuto(Automobile auto) {
        // inserisco l'auto
        automobileRepository.save(auto);

        // rileggere il DB aggiornato e ritornarlo
        return aggiorna();
    }

    @Override
    public ListeAutoDto ricercaAuto(String criterio) {
        List<Automobile> lista = automobileRepository
                .findByTargaContainsOrModelloContains(criterio, criterio);
        return new ListeAutoDto(lista);
    }

    @Override
    public ListeAutoDto cancellaAuto(Automobile auto) {
        automobileRepository.delete(auto);
        return aggiorna();
    }

    @Override
    public BolloDto calcolaBollo(Automobile auto) {
        double bollo = auto.getCilindrata() / 10.0;
        return new BolloDto(bollo);
    }

    @Override
    public ListeAutoDto aggiorna() {
        List<Automobile> lista = automobileRepository.findAll();
        return new ListeAutoDto(lista);
    }

}
