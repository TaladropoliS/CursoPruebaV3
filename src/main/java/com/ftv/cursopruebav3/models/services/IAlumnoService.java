package com.ftv.cursopruebav3.models.services;

import com.ftv.cursopruebav3.models.dto.Alumno;

import java.util.List;

public interface IAlumnoService {

    List<Alumno> findAll();

    void save(Alumno alumno);

    Alumno findById(Integer id);

    void deleteById(Integer id);
}
