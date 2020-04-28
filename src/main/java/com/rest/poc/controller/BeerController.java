package com.rest.poc.controller;

import com.rest.poc.entity.Beer;
import com.rest.poc.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class BeerController {
    
    @Autowired
    private BeerRepository beerRepository;

    @GetMapping("/good-beers")
    public Collection<Beer> goodBeers() {

        return beerRepository.findAll().stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    private boolean isGreat(Beer beer) {
        return !beer.getName().equals("Budweiser") &&
                !beer.getName().equals("Coors Light") &&
                !beer.getName().equals("PBR");
    }
}
