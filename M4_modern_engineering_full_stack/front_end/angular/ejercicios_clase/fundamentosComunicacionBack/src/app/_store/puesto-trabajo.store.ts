import { Injectable, signal } from '@angular/core';
import { PuestoTrabajo } from '../_modelo/puesto-trabajo';
import { BehaviorSubject, switchMap } from 'rxjs';
import { PuestoTrabajoFase3Service } from '../_servicios/puesto-trabajo-fase3-service';
import { toSignal } from '@angular/core/rxjs-interop';

@Injectable({
  providedIn: 'root',
})
export class PuestoTrabajoStore {

 puestos = signal<PuestoTrabajo[]>([]).asReadonly();

  // Trigger para recargar datos
  private reload$ = new BehaviorSubject<void>(undefined);


  constructor(private service: PuestoTrabajoFase3Service) {
  this.puestos = toSignal(
    this.reload$.pipe(
      switchMap(() => this.service.listar())
    ),
    { initialValue: [] }
  );
}

  // Métodos CRUD
  recargar() {
    this.reload$.next();
  }

  alta(puesto: PuestoTrabajo) {
    this.service.alta(puesto).subscribe(() => this.recargar());
  }

  modificar(puesto: PuestoTrabajo) {
    this.service.modificar(puesto).subscribe(() => this.recargar());
  }

  eliminar(id: number) {
    this.service.eliminar(id).subscribe(() => this.recargar());
  }
  
}
