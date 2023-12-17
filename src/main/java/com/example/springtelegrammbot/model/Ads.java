package com.example.springtelegrammbot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "ads_table")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Ads {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "ad")
    private String ad;
}
