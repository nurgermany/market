package com.example.market.controller;

import com.example.market.entity.City;
import com.example.market.repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public List<City> getAllCities(){
        return cityRepository.findAll();
    }

    @GetMapping("/{id}")
    public City getCityById(PathVariable Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @PostMapping("/{id}")
    public City createCity(@RequestBody City city) {
        return cityRepository.save(city);
    }

    @PutMapping("/{id}")
    public City updateCity(@PathVariable Long id, @RequestBody City city) {
        city.setId(id);
        return cityRepository.save(city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityRepository.deleteById(id);
    }




}
