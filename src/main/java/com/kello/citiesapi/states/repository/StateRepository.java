package com.kello.citiesapi.states.repository;

import com.kello.citiesapi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
