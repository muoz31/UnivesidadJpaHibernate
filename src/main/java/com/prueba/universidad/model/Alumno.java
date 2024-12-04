package com.prueba.universidad.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "alumnos")
public class Alumno extends Persona {

    @Column(nullable = false)
    private String numeroMatricula;

    @Column(nullable = false)
    private String programa;

    @Column(nullable = false)
    private Double notaPromedio;

    @Override
    public void comer() {
        System.out.println("El alumno " + " está comiendo.");
    }

    @Override
    public void descansar() {
        System.out.println("El alumno " + " está descansando.");
    }
}