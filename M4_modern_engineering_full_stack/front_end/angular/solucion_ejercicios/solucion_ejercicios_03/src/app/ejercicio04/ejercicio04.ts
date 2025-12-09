import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio04',
  imports: [FormsModule],
  templateUrl: './ejercicio04.html',
  styleUrl: './ejercicio04.css',
})
export class Ejercicio04 {
  textoPlaceholder: string = 'Introduce tu texto aquí';
}
