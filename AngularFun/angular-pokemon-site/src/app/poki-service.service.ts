import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class PokiServiceService {

  constructor(private httpService:HttpClient) { }
}
getPokemonByName(name:string):Observable<>{
return this.httpService.get<
}