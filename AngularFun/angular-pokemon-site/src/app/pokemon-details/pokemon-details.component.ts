import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-pokemon-details',
  templateUrl: './pokemon-details.component.html',
  styleUrls: ['./pokemon-details.component.css']
})
export class PokemonDetailsComponent implements OnInit {
  @Input() name:string;
  @Input() spriteUrl:string;
  constructor() { }

  ngOnInit(): void {
  }

}
