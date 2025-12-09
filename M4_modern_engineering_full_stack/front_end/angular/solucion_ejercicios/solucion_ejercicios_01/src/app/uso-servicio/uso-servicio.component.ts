import { Component, OnInit } from '@angular/core';
import { Demo01 } from '../_servicios/demo01';

@Component({
  selector: 'app-uso-servicio',
  standalone: true,
  imports: [],
  templateUrl: './uso-servicio.component.html',
  styleUrl: './uso-servicio.component.css'
})
export class UsoServicioComponent implements OnInit{
    constructor(private servicio:Demo01) { }
  ngOnInit(): void {
    this.servicio.log('UsoServicioComponent initialized');
  }
  usarServicio(): void {
    this.servicio.log('Botón usarServicio pulsado');
  }
 

}
