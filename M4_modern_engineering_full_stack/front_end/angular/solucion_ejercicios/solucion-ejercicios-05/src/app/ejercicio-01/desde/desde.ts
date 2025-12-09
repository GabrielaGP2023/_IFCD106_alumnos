import { Component } from '@angular/core';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-desde',
  imports: [RouterModule],
  templateUrl: './desde.html',
  styleUrl: './desde.css',
})
export class Desde {
  constructor(private rutas: Router) {}

  navegar() {
    // Lógica de navegación si es necesario
    this.rutas.navigate(['/ejercicio01-parametro', 42]);

  }

}
