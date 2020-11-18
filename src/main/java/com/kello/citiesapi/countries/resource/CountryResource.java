package com.kello.citiesapi.countries.resource;

import com.kello.citiesapi.countries.entity.Country;
import com.kello.citiesapi.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    };

    @GetMapping("/{id}")
    public ResponseEntity findOne(@PathVariable Long id) {

        Optional<Country> op = repository.findById(id);

        if(op.isPresent()) {
            return ResponseEntity.ok(op);
        }
        return ResponseEntity.notFound().build();
    }

}
