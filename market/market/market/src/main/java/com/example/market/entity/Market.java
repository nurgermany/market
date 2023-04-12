package com.example.market.entity;

import com.example.market.entity.City;
import com.example.market.entity.Street;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "markets")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @ManyToOne
    @JoinColumn(name = "street_id",nullable = false)
    private Street street;

    @Column(nullable = false)
    private String houseNumber;

    @Column(nullable = false)
    private LocalDate openingTime;

    @Column(nullable = false)
    private LocalDate closingTime;

}
