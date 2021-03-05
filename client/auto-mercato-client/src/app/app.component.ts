import { CriterioRicercaDto } from './criterio-ricerca-dto';
import { ListeAutoDto } from './liste-auto-dto';
import { AutoDto } from './auto-dto';
import { Automobile } from './automobile';
import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  auto = new Automobile();
  search = "";
  bolloAnnuo = 0;
  automobili: Automobile[] = [];

  constructor(private http: HttpClient) { }

  aggiungi() {
    // prepariamo i dati da inviare al server
    let dto = new AutoDto();
    dto.automobile = this.auto;

    // chiamiamo il servizio REST
    let ox = this.http.post<ListeAutoDto>(
      "http://localhost:8080/inserisci-auto",
      dto
    );
    ox.subscribe(r => this.automobili = r.listaAuto);

    // ripulisce i campi
    this.auto = new Automobile();
  }

  ricerca() {
    // preparo i dati
    let criterio = new CriterioRicercaDto();
    criterio.stringa = this.search;

    // chiamo il REST
    let oss = this.http.post<ListeAutoDto>(
      "http://localhost:8080/ricerca-auto",
      criterio
    );
    oss.subscribe(v => this.automobili = v.listaAuto);
  }

  rimuovi() { }

  calcolaBollo() { }

  resetDB() { }
}
