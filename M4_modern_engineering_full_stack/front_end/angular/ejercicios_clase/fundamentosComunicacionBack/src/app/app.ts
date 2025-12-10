import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Demo01 } from './signals/demo01/demo01';
import { ListaEmpleados } from './paginas/lista-empleados/lista-empleados';
import { AltaTwoWayBinding } from './paginas/alta-two-way-binding/alta-two-way-binding';
import { AltaFormularioReactivo } from './paginas/alta-formulario-reactivo/alta-formulario-reactivo';
import { ListaStore } from './paginas/lista-store/lista-store';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Demo01, ListaEmpleados, AltaTwoWayBinding, AltaFormularioReactivo, ListaStore],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('fundamentosComunicacionBack');
}
