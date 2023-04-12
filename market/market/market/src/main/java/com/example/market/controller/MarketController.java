package com.example.market.controller;

import com.example.market.entity.Market;
import com.example.market.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/markets")
public class MarketController {

    @Autowired
    private MarketRepository marketRepository;

    @GetMapping
    public List<Market> getAllStores() {
        return marketRepository.findAll();
    }

    @GetMapping("/{id}")
    public Market getMarketById(@PathVariable Long id) {
        return marketRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Market createStore(@RequestBody Market market) {
        return marketRepository.save(market);
    }

    @PutMapping("/{id}")
    public Market updateMarket(@PathVariable Long id, @RequestBody Market market) {
        market.setId(id);
        return marketRepository.save(market);
    }

    @DeleteMapping("/{id}")
    public void deleteMarket(@PathVariable Long id) {
        marketRepository.deleteById(id);
    }
}
