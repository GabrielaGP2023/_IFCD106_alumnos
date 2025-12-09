import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-contacto',
  imports: [FormsModule],
  templateUrl: './contacto.html',
  styleUrl: './contacto.css',
})
export class Contacto {
  nombre = '';
  apellidos = '';
  correo = '';
  telefono = '';

  mostrarDatos() {
    alert(
      `Nombre: ${this.nombre}\n` +
      `Apellidos: ${this.apellidos}\n` +
      `Correo: ${this.correo}\n` +
      `Teléfono: ${this.telefono}`
    );
  }

}
