import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio07',
  imports: [FormsModule],
  templateUrl: './ejercicio07.html',
  styleUrl: './ejercicio07.css',
})
export class Ejercicio07 {
  divisa:string="libra";
  num:number=0;
  resultado:number=0;
 
  convert(divisa:string){
    switch(divisa){
      case "jen":
        this.resultado = this.num*146.64;
        break;
      case "dolar":
        this.resultado=this.num*1.10;
        break;
      case "libra":
        this.resultado=this.num*0.88;
        break;
    }
  }

}
