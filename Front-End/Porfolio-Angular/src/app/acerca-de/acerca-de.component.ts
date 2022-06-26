import { Component, OnInit } from '@angular/core';
import { Persona } from '../Model/persona.model';
import{PersonasService} from 'src/app/service/personas.service';
@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
Persona: Persona =new Persona("","","");
  constructor(public personaService: PersonasService) { }

  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data=>{this.Persona= data})
  }

}
