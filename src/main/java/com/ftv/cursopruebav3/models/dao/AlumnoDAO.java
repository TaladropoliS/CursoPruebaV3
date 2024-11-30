package com.ftv.cursopruebav3.models.dao;

import com.ftv.cursopruebav3.models.dto.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoDAO extends JpaRepository<Alumno, Integer> {
}
