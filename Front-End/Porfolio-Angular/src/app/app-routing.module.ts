import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegistroComponent } from './registro/registro.component';


const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'login', component:LoginComponent},
  {path:'registro', component:RegistroComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
