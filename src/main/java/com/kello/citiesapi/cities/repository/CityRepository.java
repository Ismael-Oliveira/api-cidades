package com.kello.citiesapi.cities.repository;

import com.kello.citiesapi.cities.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
