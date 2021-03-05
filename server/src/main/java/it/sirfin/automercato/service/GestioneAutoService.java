package it.sirfin.automercato.service;

import it.sirfin.automercato.dto.AutoDto;
import it.sirfin.automercato.dto.ListeAutoDto;
import it.sirfin.automercato.model.Automobile;
import org.springframework.web.bind.annotation.RequestBody;

public interface GestioneAutoService {

    ListeAutoDto inserisciAuto(Automobile auto);
    ListeAutoDto aggiorna();
}
