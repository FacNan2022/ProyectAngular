import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { usuario } from '../Model/usuario';
import { HeaderService } from '../srvicios/header.service';

@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html',
  styleUrls: ['./encabezado.component.css']
})
export class EncabezadoComponent implements OnInit {
public usuario: usuario | undefined;
public editUsuario : usuario | undefined;

  constructor(private headerService: HeaderService) { }

  ngOnInit(): void {
    this.getUser();
  }
   public getUser():void{
    this.headerService.getUser().subscribe({
      next: (response: usuario)=>{
        this.usuario=response;
      },
      error:(error: HttpErrorResponse)=>{
        alert (error.message);
      }
  
    })
   }

}
