import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable} from 'rxjs';
import { environment } from 'src/environments/environment';
import { educacion } from '../Model/educacion';

@Injectable({
  providedIn: 'root'
})
export class EducacionService {
private apiServerUrl=environment.apiBaseUrl;
  constructor(private http:HttpClient) { }
  public getEducacion(): Observable<educacion[]>{
     return this.http.get<educacion[]>(`${this.apiServerUrl}/educacion/all`);
  }
  public addEducacion(educacion: educacion): Observable<educacion>{
    return this.http.post<educacion>(`${this.apiServerUrl}/educacion/add`, educacion);
  }
  public updateEducacion(educacion: educacion): Observable<educacion>{
    return this.http.put<educacion>(`${this.apiServerUrl}/educacion/update`, educacion);
  }
  public deleteEducacion(educacionId: number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/educacion/delete/${educacionId}`)
  }
  
 

}
