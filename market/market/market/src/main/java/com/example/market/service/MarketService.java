package com.example.market.service;


import com.example.market.repository.MarketRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MarketService {
    @Autowired
    MarketRepository repository;
}
