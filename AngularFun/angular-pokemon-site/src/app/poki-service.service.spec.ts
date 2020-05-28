import { TestBed } from '@angular/core/testing';

import { PokiServiceService } from './poki-service.service';

describe('PokiServiceService', () => {
  let service: PokiServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PokiServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
