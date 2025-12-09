import { Routes } from '@angular/router';
import { Inicio } from './inicio/inicio';
import { QuienesSomos } from './quienes-somos/quienes-somos';
import { DondeEstamos } from './donde-estamos/donde-estamos';
import { Contacto } from './contacto/contacto';

export const routes: Routes = [
    {path: '', redirectTo: 'inicio', pathMatch: 'full' },
    {path: 'inicio', component: Inicio },
    {path: 'quienes-somos',component: QuienesSomos},
    {path: 'donde-estamos', component: DondeEstamos},
    {path: 'contacto', component:Contacto},
    {path: '**', redirectTo: 'inicio' }
];
