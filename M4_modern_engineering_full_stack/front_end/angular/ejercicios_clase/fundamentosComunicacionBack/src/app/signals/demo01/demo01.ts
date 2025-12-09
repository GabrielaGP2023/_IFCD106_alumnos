import { Component, computed, effect, OnInit, signal } from '@angular/core';

@Component({
  selector: 'app-demo01',
  imports: [],
  templateUrl: './demo01.html',
  styleUrl: './demo01.css',
})
export class Demo01  {

  constructor() {
    effect(() => {
      console.log('El valor del contador es: ', this.contador());
      console.log('El valor del doble es: ', this.doble());
    });
  }
  contador = signal(0);
  doble = computed(() => this.contador() * 2);

  incrementar() {
    this.contador.update((valor) => valor + 1);
  }
 

}
