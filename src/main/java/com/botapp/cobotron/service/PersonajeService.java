package com.botapp.cobotron.service;

import com.botapp.cobotron.model.Personaje;
import com.botapp.cobotron.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    //CRUD

    //Create
    public Personaje save(Personaje personaje){
        return personajeRepository.save(personaje);
    }

    //Read All
    public List<Personaje> findAll() {
        return personajeRepository.findAll();
    }

    //Read by Id
    public Optional<Personaje> findById(Integer id) {
        return personajeRepository.findById(id);
    }

    //Update
    public Personaje update(Integer id, Personaje personaje) {
        Personaje updatePersonaje = personajeRepository.findById(id).orElse(null);
        if(updatePersonaje != null){
            updatePersonaje.setName(personaje.getName());
            updatePersonaje.setNickname(personaje.getNickname());
            updatePersonaje.setBirthdate(personaje.getBirthdate());
            updatePersonaje.setDescription(personaje.getDescription());
            updatePersonaje.setColor(personaje.getColor());
            updatePersonaje.setStrength(personaje.getStrength());
            updatePersonaje.setSpeed(personaje.getSpeed());
            updatePersonaje.setIntelligence(personaje.getIntelligence());
            updatePersonaje.setSex(personaje.getSex());
            updatePersonaje.setPhrase(personaje.getPhrase());
            return personajeRepository.save(updatePersonaje);
        }
        return null;
    }

    //Delete
    public void deleteById(Integer id) {
        if(personajeRepository.findById(id).isPresent()) {
            personajeRepository.deleteById(id);
        }
    }
}
