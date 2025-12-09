import { Component, OnInit, signal } from '@angular/core';
import { ServicioPuestoTrabajo } from '../_servicios/servicio-puesto-trabajo';
import { PuestoTrabajo } from '../_modelo/puesto-trabajo';

@Component({
  selector: 'app-lista-puestos-trabajo',
  standalone: true,
  providers: [ServicioPuestoTrabajo],
  templateUrl: './lista-puestos-trabajo.html',
  styleUrl: './lista-puestos-trabajo.css',
})
export class ListaPuestosTrabajo implements OnInit {

  puestosTrabajo = signal<PuestoTrabajo[]>([]);

  constructor(private servicioPuestoTrabajo: ServicioPuestoTrabajo) {

  }
  ngOnInit(): void {
    this.servicioPuestoTrabajo.obtenerPuestosTrabajo().subscribe(datos => 
      {
      this.puestosTrabajo.set(datos);
      console.log(this.puestosTrabajo);
      console.log("Component: puestosTrabajo cargados");});
  }

}
