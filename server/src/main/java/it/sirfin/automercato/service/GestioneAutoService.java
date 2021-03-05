package it.sirfin.automercato.service;

import it.sirfin.automercato.dto.ListeAutoDto;
import it.sirfin.automercato.model.Automobile;

public interface GestioneAutoService {

    ListeAutoDto inserisciAuto(Automobile auto);

    ListeAutoDto ricercaAuto(String criterio);

    ListeAutoDto aggiorna();
}
