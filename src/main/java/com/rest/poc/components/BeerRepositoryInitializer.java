package com.rest.poc.components;

import com.rest.poc.entity.Beer;
import com.rest.poc.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;


@Component
public class BeerRepositoryInitializer implements CommandLineRunner {
    
    @Autowired
    private BeerRepository beerRepository;
    
    @Override
    public void run(String... args) throws Exception {
        Stream.of("Kentucky Brunch Brand Stout", "Good Morning", "Very Hazy", "King Julius",
                "Budweiser", "Coors Light", "PBR").forEach(name ->
                beerRepository.save(new Beer(name))
        );
        beerRepository.findAll().forEach(System.out::println);
    }
}
