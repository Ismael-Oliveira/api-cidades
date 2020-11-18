package com.kello.citiesapi.cities.resource;

import com.kello.citiesapi.cities.entity.City;
import com.kello.citiesapi.cities.repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cities")
public class CityResource {

    @Autowired
    public CityRepository repository;

    @GetMapping
    public Page<City> cities(Pageable page) {
        Page<City> teste = repository.findAll(page);
        return teste;
    }
}
