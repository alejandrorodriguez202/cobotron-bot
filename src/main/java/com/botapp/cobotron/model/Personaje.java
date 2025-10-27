package com.botapp.cobotron.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "personajes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "nickname", nullable = false)
    private String nickname;
    @Column(name = "birthdate", nullable = false)
    private String birthdate;
    @Column(name = "description")
    private String description;
    @Column(name = "color")
    private String color;
    @Column(name = "strength")
    private int strength;
    @Column(name = "speed")
    private int speed;
    @Column(name = "intelligence")
    private int intelligence;
    @Column(name = "sex")
    private String sex;
    @Column(name = "phrase")
    private String phrase;
}
