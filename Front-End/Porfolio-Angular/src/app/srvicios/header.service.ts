import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { usuario } from '../Model/usuario';

@Injectable({
  providedIn: 'root'
})
export class HeaderService {
private apiServerUrl=environment.apiBaseUrl;
  constructor(private http: HttpClient) { }
public getUser(): Observable<usuario>{
  return this.http.get<usuario>(`${this.apiServerUrl}/usuario/id/1`);
}
public updateUsuario( usuario: usuario): Observable<usuario>{
  return this.http.put<usuario>(`${this.apiServerUrl}/usuario/update`,usuario);
}

}
