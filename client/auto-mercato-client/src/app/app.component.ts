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

  aggiungi() { }

  ricerca() { }

  rimuovi() { }

  calcolaBollo() { }

  resetDB() { }
}
