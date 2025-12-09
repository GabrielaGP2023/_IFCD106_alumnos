import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio08',
  imports: [FormsModule],
  templateUrl: './ejercicio08.html',
  styleUrl: './ejercicio08.css',
})
export class Ejercicio08 {
  origen:string = '';
  destino:string = '';
  fIda:any='';
  fVuelta:any='';
  nPasajeros:number = 0; 
  ciudades:string[] = ["Madrid", "Barcelona", "Bilbao", "Santander", "Vigo"];
  

  mostrarInfo():void {
    let mensaje =`
    Origen: ${this.origen}
    Destino: ${this.destino}
    Fecha de Ida : ${this.fIda}
    Fecha de Vuelta :${this.fVuelta}
    Número de pasajeros : ${this.nPasajeros}
    `;
    alert(mensaje);
  }

}
