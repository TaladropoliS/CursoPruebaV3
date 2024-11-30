package com.ftv.cursopruebav3.controllers;

import com.ftv.cursopruebav3.models.dto.Alumno;
import com.ftv.cursopruebav3.models.services.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiRestControllers {

    @Autowired
    private IAlumnoService alumnoService;

    @GetMapping("/api/listaAlumnos")
    public ResponseEntity<List<Alumno>> listar(){
        try {
            List<Alumno> lista = alumnoService.findAll();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
