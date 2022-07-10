import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { educacion } from '../Model/educacion';
import { EducacionService } from '../srvicios/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {
public educacion: educacion[]=[];

  constructor(private educacionService: EducacionService) { }

  ngOnInit(): void {
    this.getEducacion();
  }
public getEducacion():void{
  this.educacionService.getEducacion().subscribe({
    next:(Response: educacion[])=>{
    this.educacion=Response;
  },
  error: function (error: HttpErrorResponse) {
    alert(error.message);
  }
  })
}

}
