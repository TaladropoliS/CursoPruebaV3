package com.ftv.cursopruebav3.controllers;

import com.ftv.cursopruebav3.models.dto.Alumno;
import com.ftv.cursopruebav3.models.services.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProyectoController {

    @Autowired
    private IAlumnoService alumnoService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "App Curso v.3");
        model.addAttribute("subTitulo", "Bootcamp JAVA");
        return "index";
    }

    @GetMapping("/listaAlumnos")
    public String listaAlumnos(Model model) {
        model.addAttribute("titulo", "App Curso v.3");
        model.addAttribute("subTitulo", "Lista de Alumnos");
        model.addAttribute("alumnos", alumnoService.findAll());
        return "listaAlumnos";
    }

    @GetMapping("/agregarAlumno")
    public String agregarAlumno(Model model) {
        model.addAttribute("titulo", "App Curso v.3");
        model.addAttribute("subTitulo", "Agregar Alumno");
        return "agregarAlumnoForm";
    }

    @PostMapping("/agregarAlumno")
    public String agregarAlumno(Model model,
                                @RequestParam String runAlu,
                                @RequestParam String nomAlu,
                                @RequestParam String apeAlu) {
        model.addAttribute("titulo", "App Curso v.3");
        model.addAttribute("subTitulo", "Agregar Alumno");
        Alumno alumno = new Alumno();
        alumno.setRunAlu(runAlu);
        alumno.setNomAlu(nomAlu);
        alumno.setApeAlu(apeAlu);
        alumnoService.save(alumno);
        return "redirect:/listaAlumnos";
    }

    @DeleteMapping("/eliminarAlumno/{id}")
    public String eliminarAlumno(Model model, @RequestParam Integer id) {
        model.addAttribute("titulo", "App Curso v.3");
        model.addAttribute("subTitulo", "Eliminar Alumno");
        alumnoService.deleteById(id);
        return "redirect:/listaAlumnos";
    }
}
