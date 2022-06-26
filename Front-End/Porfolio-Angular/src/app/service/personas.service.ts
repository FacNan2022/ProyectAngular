import{Injectable} from '@angular/core';
import{HttpClient, HttpClientModule} from'@angular/common/http';
import { Observable } from 'rxjs';
import { Persona } from '../Model/persona.model';
@Injectable({
  providedIn: 'root'
})
export class PersonasService {
URL= 'http:localhost:8080/Personas/' ;

  constructor(private http: HttpClient) {}
public getPersona(): Observable<Persona>{
return this.http.get<Persona>(this.URL + 'traer/perfil') 
}

}
