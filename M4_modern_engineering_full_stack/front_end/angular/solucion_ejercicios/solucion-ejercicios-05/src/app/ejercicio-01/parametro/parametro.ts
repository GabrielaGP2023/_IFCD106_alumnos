import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, RouterModule } from '@angular/router';

@Component({
  selector: 'app-parametro',
  imports: [],
  templateUrl: './parametro.html',
  styleUrl: './parametro.css',
})
export class Parametro implements OnInit{
    id: number = 0;

  constructor(private route: ActivatedRoute) {}

  ngOnInit(): void {
    if (this.route.snapshot.paramMap.get('id')) {
      this.id = Number(this.route.snapshot.paramMap.get('id'));
    }

    console.log('Parámetro recibido:', this.id);
  }
}
