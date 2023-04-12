package com.example.market.controller;

import com.example.market.entity.Street;
import com.example.market.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treets")
public class StreetController {

    @Autowired
    private StreetRepository streetRepository;

    @GetMapping
    public List<Street> getAllStreets() {
        return streetRepository.findAll();
    }

    @GetMapping("/{id}")
    public Street getStreetById(@PathVariable Long id) {
        return streetRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Street createStreet(@RequestBody Street street) {
        return streetRepository.save(street);
    }

    @PutMapping("/{id}")
    public Street updateStreet(@PathVariable Long id, @RequestBody Street street) {
        street.setId(id);
        return streetRepository.save(street);
    }

    @DeleteMapping("/{id}")
    public  void deleteStreet(@PathVariable Long id) {
        streetRepository.deleteById(id);
    }
}
