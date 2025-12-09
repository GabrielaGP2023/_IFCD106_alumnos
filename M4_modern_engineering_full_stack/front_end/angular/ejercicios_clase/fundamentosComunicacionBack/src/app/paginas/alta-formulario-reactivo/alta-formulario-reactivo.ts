import { Component, OnInit } from '@angular/core';
import { PuestoTrabajo } from '../../_modelo/puesto-trabajo';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { PuestoTrabajoServicio } from '../../_servicios/puesto-trabajo-service';

@Component({
  selector: 'app-alta-formulario-reactivo',
  imports: [ReactiveFormsModule],
  templateUrl: './alta-formulario-reactivo.html',
  styleUrl: './alta-formulario-reactivo.css',
})
export class AltaFormularioReactivo implements OnInit{
  formularioPuestoTrabajo!: FormGroup;
  ngOnInit(): void {
    this.formularioPuestoTrabajo = new FormGroup({
     nombre: new FormControl(''),
     nivel :new FormControl(0),
     sueldo: new FormControl(0),
    }); 
  }

  constructor(private puestoTrabajoServicio: PuestoTrabajoServicio ) {}
  puestoTrabajo : PuestoTrabajo = { id: 0, nombre: '', nivel: 0, sueldo: 0 };

  altafase2(): void {
  this.puestoTrabajo = this.formularioPuestoTrabajo.value;
  console.log('Puesto de trabajo a crear: ', this.puestoTrabajo);
  this.puestoTrabajoServicio.altaPuestoTrabajoFase2(this.puestoTrabajo)
    .subscribe({
      next: (puestoCreado) => {
        console.log('Puesto de trabajo creado: ', puestoCreado);
        this.puestoTrabajo = { id: 0, nombre: '', nivel: 0, sueldo: 0 };
        this.formularioPuestoTrabajo.reset();
        // no necesitamos más, el Subject notificará a la lista
      },
      error: (err) => console.error(err)
    });

}
}
