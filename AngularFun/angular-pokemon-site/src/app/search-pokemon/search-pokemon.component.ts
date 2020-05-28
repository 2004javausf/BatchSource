import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-search-pokemon',
  templateUrl: './search-pokemon.component.html',
  styleUrls: ['./search-pokemon.component.css']
})
export class SearchPokemonComponent implements OnInit {
  name: string;
  spriteUrl:string;
  constructor() { }

  ngOnInit(): void {
  }

}
