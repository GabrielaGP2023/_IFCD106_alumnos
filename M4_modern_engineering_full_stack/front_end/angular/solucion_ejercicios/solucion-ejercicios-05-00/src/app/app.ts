import { Component, signal } from '@angular/core';
import { RouterLink, RouterModule, RouterOutlet } from '@angular/router';
import { ListaPuestosTrabajo } from './lista-puestos-trabajo/lista-puestos-trabajo';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule,
    RouterOutlet,
    RouterLink,
    ListaPuestosTrabajo],

  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('solucion-ejercicios-04-00');
}
