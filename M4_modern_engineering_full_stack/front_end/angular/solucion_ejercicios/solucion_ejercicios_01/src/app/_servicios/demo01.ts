import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class Demo01 {
  log(mensaje: string): void {
    console.log('Demo01 service log:', mensaje);
  }
}
