package com.example.market.service;

import com.example.market.repository.StreetRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StreetService {
    @Autowired
    StreetRepository repository;
}
