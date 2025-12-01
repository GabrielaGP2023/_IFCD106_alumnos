import { Component } from '@angular/core';
import { Routes } from '@angular/router';
import { App } from './app';
import { Desde } from './desde/desde';
import { Hacia } from './hacia/hacia';
import { Parametro } from './parametro/parametro';
import { ErrorNavegacion } from './error-navegacion/error-navegacion';

export const routes: Routes = [
{path:'hacia',component:Hacia},
{path: 'parametro/:id', component:Parametro},

{path:'**',component:ErrorNavegacion}

];
