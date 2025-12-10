import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { HOST_API } from '../_entorno/entorno';
import { Observable } from 'rxjs';
import { PuestoTrabajo } from '../_modelo/puesto-trabajo';

@Injectable({
  providedIn: 'root',
})
export class PuestoTrabajoFase3Service {

  url: string = `${HOST_API}/api/puestos-trabajo`;
  constructor(private http: HttpClient) { }

  listar(): Observable<PuestoTrabajo[]> {
    return this.http.get<PuestoTrabajo[]>(this.url);
  }

  alta(puesto: PuestoTrabajo): Observable<PuestoTrabajo> {
    return this.http.post<PuestoTrabajo>(this.url, puesto);
  }

  modificar(puesto: PuestoTrabajo): Observable<PuestoTrabajo> {
    return this.http.put<PuestoTrabajo>(`${this.url}/${puesto.id}`, puesto);
  }

  eliminar(id: number): Observable<void> {
    return this.http.delete<void>(`${this.url}/${id}`);
  }

}
