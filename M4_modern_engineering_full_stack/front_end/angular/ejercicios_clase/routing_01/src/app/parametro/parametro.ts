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
    const param = this.route.snapshot.paramMap.get('id');

    if (param) {
      this.id = Number(param);
    }

    console.log('Parámetro recibido:', this.id);
  }

 

}
