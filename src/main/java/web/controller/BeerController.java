package web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.model.BeerDto;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerID){
        return null;
    }

    @PostMapping
    public ResponseEntity saveNewBeer(BeerDto beerDto){
        // TODO Da implementare
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerID, @RequestBody  BeerDto beerDto){
        // TODO Da implementare
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
