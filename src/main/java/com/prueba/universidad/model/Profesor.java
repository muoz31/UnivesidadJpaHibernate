package com.prueba.universidad.model;

import com.prueba.universidad.model.Persona;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "profesores")
public class Profesor extends Persona {

    @Column(nullable = false)
    private Double salario;

    @Column(nullable = false)
    private String dependencia;

    @Column(nullable = false)
    private String materia;

    @Override
    public void comer() {
        System.out.println("El profesor "  + " está comiendo.");
    }

    @Override
    public void descansar() {
        System.out.println("El profesor "  + " está descansando.");
    }
}
