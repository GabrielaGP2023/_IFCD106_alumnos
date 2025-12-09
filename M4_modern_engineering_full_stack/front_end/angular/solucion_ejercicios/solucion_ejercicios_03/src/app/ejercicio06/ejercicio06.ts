import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio06',
  imports: [FormsModule],
  templateUrl: './ejercicio06.html',
  styleUrl: './ejercicio06.css',
})
export class Ejercicio06 {
  num1:number=0;
  num2:number=0;
  result:number=0;
  
suma(){
  this.result=this.num1+this.num2;
  return this.result;
}
resta(){
  this.result=this.num1-this.num2;
  return this.result;
}
multiplicacion(){
  this.result=this.num1*this.num2;
  return this.result;
}
division(){
  this.result=this.num1/this.num2;
  return this.result;
}

}
