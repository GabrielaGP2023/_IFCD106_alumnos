import { Routes } from '@angular/router';
import { Desde } from './ejercicio-01/desde/desde';
import { Parametro } from './ejercicio-01/parametro/parametro';
import { ErrorNavegacion } from './ejercicio-01/error-navegacion/error-navegacion';

export const routes: Routes = [
    {path: '', redirectTo: 'inicio', pathMatch: 'full' },
    {path: 'ejercicio01', component: Desde},
    {path: 'ejercicio01-parametro/:id', component: Parametro},
    {path: '**', component:ErrorNavegacion}
];
