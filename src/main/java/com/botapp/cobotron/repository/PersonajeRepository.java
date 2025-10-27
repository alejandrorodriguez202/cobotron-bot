package com.botapp.cobotron.repository;

import com.botapp.cobotron.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje, Integer> {
}
