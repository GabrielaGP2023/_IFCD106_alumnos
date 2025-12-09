import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio04',
  imports: [],
  templateUrl: './ejercicio04.html',
  styleUrl: './ejercicio04.css',
})
export class Ejercicio04 {
  indice: number=0;
  rolUsuario!: string;
  roles: string[] = ['admin', 'editor', 'viewer'];


cambiarRol() {
  this.indice = (this.indice + 1) % this.roles.length;
  this.rolUsuario = this.roles[this.indice];
;
}


}
