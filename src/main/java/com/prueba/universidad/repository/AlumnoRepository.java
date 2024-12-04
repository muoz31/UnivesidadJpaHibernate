package com.prueba.universidad.repository;

import com.prueba.universidad.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}