package com.rest.poc.repository;

import com.rest.poc.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource 
public interface BeerRepository extends JpaRepository<Beer, Long> {};