import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio03',
  imports: [],
  templateUrl: './ejercicio03.html',
  styleUrl: './ejercicio03.css',
})
export class Ejercicio03 {
  deshabilitado: boolean = true;
  cambiarEstado() {
    this.deshabilitado = !this.deshabilitado;
  }
}
