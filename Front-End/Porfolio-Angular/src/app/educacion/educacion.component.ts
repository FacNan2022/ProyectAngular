import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { educacion } from '../Model/educacion';
import { EducacionService } from '../srvicios/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

public educacion: educacion[]=[];
public editEducacion: educacion | undefined;
public deleteEducacion: educacion | undefined;
  
constructor(private educacionService: EducacionService) {}

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

public onOpenModal(mode:String, educacion?:educacion):void{
const container=document.getElementById('main-container');
const button=document.createElement('button');
button.style.display='none';
button.setAttribute('data-toggle','modal');
if(mode==='add'){
  button.setAttribute('data-target','#addEducacionModal');
}else if (mode==='delete'){
  this.deleteEducacion=educacion;
  button.setAttribute('data-target','#deleteEducacionModal');
}else if (mode==='edit'){
  this.editEducacion=educacion;
  button.setAttribute('data-target','#editEducacionModal');
}
container?.appendChild(button);
button.click();
} 

public onAddEducacion(addForm: NgForm){
document.getElementById('add-educacion-form')?.click();
this.educacionService.addEducacion(addForm.value).subscribe({
next:(response:educacion)=>{
  console.log(response);
  this.getEducacion();
  addForm.resetForm();
}, 
error:(error: HttpErrorResponse)=>{
  alert(error.message);
  addForm.reset();
}
})

}

public onUpdateEducacion(educacion: educacion){
  this.editEducacion=educacion;
  document.getElementById('add-educacion-form')?.click();
  this.educacionService.updateEducacion(educacion).subscribe({
  next:(response:educacion)=>{
    console.log(response);
    this.getEducacion();
   
  },
  error:(error: HttpErrorResponse)=>{
    alert(error.message);
  }
  
  })
  
  }

  public onDeleteEducacion(idEdu: number):void{
    this.educacionService.deleteEducacion(idEdu).subscribe({
    next:(response:void)=>{
      console.log(response);
      this.getEducacion();
     
    },
    error:(error: HttpErrorResponse)=>{
      alert(error.message);
    }
    
    })
    
    }

}

