package com.example.springtelegrammbot.repository;

import com.example.springtelegrammbot.model.Ads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdsRepository extends JpaRepository<Ads, Long> {
}
