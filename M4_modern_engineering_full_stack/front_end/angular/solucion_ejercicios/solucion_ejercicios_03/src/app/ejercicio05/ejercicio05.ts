import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio05',
  imports: [FormsModule],
  templateUrl: './ejercicio05.html',
  styleUrl: './ejercicio05.css',
})
export class Ejercicio05 {
restablecer() {
this.contador = 0;
}
  contador: number = 0;
  valorCambiar!: number;
  deshabilitarDecrementar: boolean = false;
  incrementar() {
    this.contador++;
    if (this.contador > 0){
      this.deshabilitarDecrementar = false;
    }
  }
  decrementar() {
    if (this.contador > 0){
      this.contador--;
    }else{
      this.deshabilitarDecrementar = true;
  }}
  cambiar() {
    this.contador = this.valorCambiar;
  }

}
