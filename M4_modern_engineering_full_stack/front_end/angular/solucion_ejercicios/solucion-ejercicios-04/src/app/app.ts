import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ejercicio01 } from './ejercicio01/ejercicio01';
import { Ejercicio02 } from './ejercicio02/ejercicio02';
import { Ejercicio03 } from './ejercicio03/ejercicio03';
import { Ejercicio04 } from './ejercicio04/ejercicio04';
import { Ejercicio05 } from './ejercicio05/ejercicio05';
import { Ejercicio06 } from './ejercicio06/ejercicio06';
import { Ejercicio07 } from './ejercicio07/ejercicio07';
import { Ejercicio08 } from './ejercicio08/ejercicio08';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Ejercicio01, Ejercicio02, Ejercicio03, Ejercicio04, Ejercicio05
    ,Ejercicio06, Ejercicio07, Ejercicio08
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('solucion-ejercicios-04');
}
