package com.example.springtelegrammbot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Entity(name = "usersDataTable")
@Getter
@Setter
@ToString
public class User {

    @Id
    private Long chatId;

    private String firstName;

    private String lastname;

    private String userName;

    private Timestamp registeredAt;

}
