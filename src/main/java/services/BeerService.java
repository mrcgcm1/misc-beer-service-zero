package services;

import web.model.BeerDto;

public interface BeerService {
    BeerDto saveNewBeer(BeerDto dto);
}
