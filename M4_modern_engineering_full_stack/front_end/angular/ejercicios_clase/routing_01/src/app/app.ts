import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Desde } from './desde/desde';

@Component({
  selector: 'app-root',
  imports: [Desde, RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('routing_01');
}
