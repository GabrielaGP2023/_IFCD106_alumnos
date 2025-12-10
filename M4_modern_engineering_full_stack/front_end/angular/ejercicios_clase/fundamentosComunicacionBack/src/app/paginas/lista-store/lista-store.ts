import { Component } from '@angular/core';
import { PuestoTrabajoStore } from '../../_store/puesto-trabajo.store';

@Component({
  selector: 'app-lista-store',
  imports: [],
  templateUrl: './lista-store.html',
  styleUrl: './lista-store.css',
})
export class ListaStore {
  constructor(public store:PuestoTrabajoStore) {}

}
