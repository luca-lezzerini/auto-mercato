package it.sirfin.automercato.controller;

import it.sirfin.automercato.dto.AutoDto;
import it.sirfin.automercato.dto.BolloDto;
import it.sirfin.automercato.dto.CriterioRicercaDto;
import it.sirfin.automercato.dto.ListeAutoDto;
import it.sirfin.automercato.service.GestioneAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class GestioneAutoController {

    @Autowired
    GestioneAutoService gestioneAutoService;

    @RequestMapping("/inserisci-auto")
    @ResponseBody
    public ListeAutoDto inserisciAuto(@RequestBody AutoDto dto) {
        System.out.println("Sono in inserisciAuto " + dto);
        return gestioneAutoService.inserisciAuto(dto.getAutomobile());
    }

    @RequestMapping("/ricerca-auto")
    @ResponseBody
    public ListeAutoDto ricercaAuto(@RequestBody CriterioRicercaDto dto) {
        return gestioneAutoService.ricercaAuto(dto.getStringa());
    }

    @RequestMapping("/cancella-auto")
    @ResponseBody
    public ListeAutoDto cancellaAuto(@RequestBody AutoDto dto) {
        return gestioneAutoService.cancellaAuto(dto.getAutomobile());
    }

    @RequestMapping("/calcola-bollo")
    @ResponseBody
    public BolloDto calcolaBollo(@RequestBody AutoDto dto) {
        return gestioneAutoService.calcolaBollo(dto.getAutomobile());
    }

    @RequestMapping("/reset-db")
    @ResponseBody
    public ListeAutoDto resetDB() {
        throw new UnsupportedOperationException();
    }

    @RequestMapping("/aggiorna-liste")
    @ResponseBody
    public ListeAutoDto aggiornaListe() {
        return gestioneAutoService.aggiorna();
    }
}
