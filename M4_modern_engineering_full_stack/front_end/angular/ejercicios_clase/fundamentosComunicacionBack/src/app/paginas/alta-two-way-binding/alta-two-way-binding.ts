import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { PuestoTrabajo } from '../../_modelo/puesto-trabajo';
import { PuestoTrabajoServicio } from '../../_servicios/puesto-trabajo-service';

@Component({
  selector: 'app-alta-two-way-binding',
  imports: [FormsModule],
  templateUrl: './alta-two-way-binding.html',
  styleUrl: './alta-two-way-binding.css',
})
export class AltaTwoWayBinding {
  puestoTrabajo : PuestoTrabajo = { id: 0, nombre: '', nivel: 0, sueldo: 0 };
  constructor(private puestoTrabajoService: PuestoTrabajoServicio) {}
   
  alta(): void {
    console.log('Puesto de trabajo a crear: ', this.puestoTrabajo); 
    this.puestoTrabajoService.altaPuestoTrabajo(this.puestoTrabajo).subscribe({
      next: (puestoCreado) => {
        console.log('Puesto de trabajo creado: ', puestoCreado);
        this.puestoTrabajo = { id: 0, nombre: '', nivel: 0, sueldo: 0 };
      },
      error: (err) => {
        console.error('Error al crear el puesto de trabajo: ', err);
      },
    });
  }
  altafase2(): void {
  this.puestoTrabajoService.altaPuestoTrabajoFase2(this.puestoTrabajo)
    .subscribe({
      next: (puestoCreado) => {
        console.log('Puesto de trabajo creado: ', puestoCreado);
        this.puestoTrabajo = { id: 0, nombre: '', nivel: 0, sueldo: 0 };
        // no necesitamos más, el Subject notificará a la lista
      },
      error: (err) => console.error(err)
    });
}

}
