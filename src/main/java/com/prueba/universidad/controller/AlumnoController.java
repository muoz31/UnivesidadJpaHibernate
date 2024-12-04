package com.prueba.universidad.controller;

import com.prueba.universidad.model.Alumno;
import com.prueba.universidad.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping
    public List<Alumno> obtenerAlumnos() {
        return alumnoRepository.findAll();
    }

    @PostMapping
    public Alumno crearAlumno(@RequestBody Alumno alumno) {
        return alumnoRepository.save(alumno);
    }
}
