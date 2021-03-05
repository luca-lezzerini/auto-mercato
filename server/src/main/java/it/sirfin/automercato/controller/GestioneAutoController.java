package it.sirfin.automercato.controller;

import it.sirfin.automercato.dto.AutoDto;
import it.sirfin.automercato.dto.BolloDto;
import it.sirfin.automercato.dto.CriterioRicercaDto;
import it.sirfin.automercato.dto.ListeAutoDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class GestioneAutoController {

    @RequestMapping("/inserisci-auto")
    @ResponseBody
    public ListeAutoDto inserisciAuto(@RequestBody AutoDto dto) {
        throw new UnsupportedOperationException();
    }

    @RequestMapping("/ricerca-auto")
    @ResponseBody
    public ListeAutoDto ricercaAuto(@RequestBody CriterioRicercaDto dto) {
        throw new UnsupportedOperationException();
    }

    @RequestMapping("/cancella-auto")
    @ResponseBody
    public ListeAutoDto cancellaAuto(@RequestBody AutoDto dto) {
        throw new UnsupportedOperationException();
    }

    @RequestMapping("/calcola-bollo")
    @ResponseBody
    public BolloDto calcolaBollo(@RequestBody AutoDto dto) {
        throw new UnsupportedOperationException();
    }

    @RequestMapping("/reset")
    @ResponseBody
    public ListeAutoDto resetDB() {
        throw new UnsupportedOperationException();
    }

    @RequestMapping("/aggiorna-liste")
    @ResponseBody
    public ListeAutoDto aggiornaListe() {
        throw new UnsupportedOperationException();
    }
}