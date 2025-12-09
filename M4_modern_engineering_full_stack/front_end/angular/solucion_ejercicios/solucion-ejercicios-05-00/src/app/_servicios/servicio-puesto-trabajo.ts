import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PuestoTrabajo } from '../_modelo/puesto-trabajo';

@Injectable({
  providedIn: 'root',
})
export class ServicioPuestoTrabajo {

  urlApi: string = 'http://localhost:8080/api/puestos-trabajo';

  constructor(private http:HttpClient) {}

  obtenerPuestosTrabajo() : Observable<PuestoTrabajo[]> {
    console.log("Servicio: obtenerPuestosTrabajo");
    return this.http.get<PuestoTrabajo[]>(this.urlApi);
  }
  
}
