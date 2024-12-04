package com.prueba.universidad.controller;

import com.prueba.universidad.model.Profesor;
import com.prueba.universidad.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    private ProfesorRepository profesorRepository;

    @GetMapping
    public List<Profesor> obtenerProfesores() {
        return profesorRepository.findAll();
    }

    @PostMapping
    public Profesor crearProfesor(@RequestBody Profesor profesor) {
        return profesorRepository.save(profesor);
    }
}