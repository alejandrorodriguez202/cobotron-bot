package com.botapp.cobotron.controller;

import com.botapp.cobotron.model.Personaje;
import com.botapp.cobotron.repository.PersonajeRepository;
import com.botapp.cobotron.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/personaje")
public class PersonajeController {
    @Autowired
    private PersonajeService personajeService;

    //Endpoints CRUD

    //Create
    @PostMapping
    public Personaje createPersonaje(@RequestBody Personaje personaje){
        return personajeService.save(personaje);
    }

    //Read
    @GetMapping
    public List<Personaje> findAll(){
        return personajeService.findAll();
    }

    //Read by ID
    @GetMapping("/{id}")
    public ResponseEntity<Personaje> findById(@PathVariable Integer id){
        return personajeService.findById(id).map(personaje -> ResponseEntity.ok(personaje)).orElse(ResponseEntity.notFound().build());
    }

    //Upadate
    @PutMapping("/{id}")
    public ResponseEntity<Personaje> updatePersonaje(@PathVariable Integer id, @RequestBody Personaje personaje){
        Personaje updatePersonaje = personajeService.update(id, personaje);
        if (updatePersonaje != null){
            return ResponseEntity.ok(updatePersonaje);
        }
        else  {
            return ResponseEntity.notFound().build();
        }
    }

    //Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonaje(@PathVariable Integer id){
        personajeService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
