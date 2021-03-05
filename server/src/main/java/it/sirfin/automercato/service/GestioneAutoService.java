package it.sirfin.automercato.service;

import it.sirfin.automercato.dto.BolloDto;
import it.sirfin.automercato.dto.ListeAutoDto;
import it.sirfin.automercato.model.Automobile;

public interface GestioneAutoService {

    ListeAutoDto inserisciAuto(Automobile auto);

    ListeAutoDto ricercaAuto(String criterio);

    ListeAutoDto cancellaAuto(Automobile auto);

    BolloDto calcolaBollo(Automobile auto);

    ListeAutoDto aggiorna();
}
