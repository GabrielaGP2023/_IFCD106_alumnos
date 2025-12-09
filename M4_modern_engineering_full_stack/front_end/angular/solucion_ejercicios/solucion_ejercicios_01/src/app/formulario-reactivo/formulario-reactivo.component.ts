import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-formulario-reactivo',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './formulario-reactivo.component.html',
  styleUrl: './formulario-reactivo.component.css'
})
export class FormularioReactivoComponent {

  formulario = new FormGroup({
    nombre: new FormControl(''),
  });

  enviar() {
    console.log('Valor del formulario:', this.formulario.value);
    alert('Valor de nombre: ' + this.formulario.value.nombre);
  }

}
