  import { HttpClient } from '@angular/common/http';
  import { Injectable } from '@angular/core';
  import { HOST_API } from '../_entorno/entorno';
  import { Observable, Subject, tap } from 'rxjs';
  import { PuestoTrabajo } from '../_modelo/puesto-trabajo';

  @Injectable({
    providedIn: 'root',
  })
  export class PuestoTrabajoServicio {
    url :string =`${HOST_API}/api/puestos-trabajo`;
    constructor(private http:HttpClient) {}

    obtenerPuestosTrabajo():Observable<PuestoTrabajo[]> {
      return this.http.get<PuestoTrabajo[]>(this.url);
    }

    altaPuestoTrabajo(puesto:PuestoTrabajo):Observable<PuestoTrabajo> {
      return this.http.post<PuestoTrabajo>(this.url, puesto);
    } 

  //  Segunda fase - notificación de cambios
  private _cambios = new Subject<void>();
  cambios$ = this._cambios.asObservable();

  altaPuestoTrabajoFase2(puesto: PuestoTrabajo) {
    return this.http.post<PuestoTrabajo>(this.url, puesto).pipe(
      tap(() => this._cambios.next()) // notificar a los suscriptores
    );
  }
    
  }
