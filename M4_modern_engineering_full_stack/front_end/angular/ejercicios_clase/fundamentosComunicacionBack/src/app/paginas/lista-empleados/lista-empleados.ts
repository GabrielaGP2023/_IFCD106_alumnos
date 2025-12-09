import { Component, OnInit, signal } from '@angular/core';

import { toSignal } from '@angular/core/rxjs-interop';
import { CurrencyPipe } from '@angular/common';
import { PuestoTrabajoServicio } from '../../_servicios/puesto-trabajo-service';
import { PuestoTrabajo } from '../../_modelo/puesto-trabajo';

@Component({
  selector: 'app-lista-empleados',
  imports: [CurrencyPipe],
  templateUrl: './lista-empleados.html',
  styleUrl: './lista-empleados.css',
})
export class ListaEmpleados implements OnInit {
  

  puestosTrabajoSignal = signal<PuestoTrabajo[]>([]);

  constructor(private puestoTrabajoService: PuestoTrabajoServicio) {}

  // ngOnInit(): void {
  //   this.puestoTrabajoService.obtenerPuestosTrabajo()
  //     .subscribe(data => this.puestosTrabajoSignal.set(data));
  // }

  

ngOnInit() {
  this.cargarLista();

  this.puestoTrabajoService.cambios$.subscribe(() => {
    this.cargarLista(); // recarga la lista automáticamente
  });
}

cargarLista() {
  this.puestoTrabajoService.obtenerPuestosTrabajo()
    .subscribe(data => this.puestosTrabajoSignal.set(data));
}
}




