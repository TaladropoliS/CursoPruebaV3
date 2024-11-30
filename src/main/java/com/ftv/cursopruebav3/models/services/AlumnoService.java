package com.ftv.cursopruebav3.models.services;

import com.ftv.cursopruebav3.models.dao.AlumnoDAO;
import com.ftv.cursopruebav3.models.dto.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService implements IAlumnoService{

    @Autowired
    AlumnoDAO alumnoDAO;

    @Override
    public List<Alumno> findAll() {
        return alumnoDAO.findAll();
    }

    @Override
    public void save(Alumno alumno) {
        alumnoDAO.save(alumno);
    }

    @Override
    public Alumno findById(Integer id) {
        return alumnoDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        alumnoDAO.deleteById(id);
    }
}
