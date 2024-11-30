package com.ftv.cursopruebav3.models.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "run_alu")
    private String runAlu;

    @Column(name = "nom_alu")
    private String nomAlu;

    @Column(name = "ape_alu")
    private String apeAlu;

    @Column(name = "promedio")
    private Double promedio;

    @Column(name = "situacion_final")
    private String situacionFinal;

//    @ManyToOne
//    @JoinColumn(name = "car_alu")
//    private Carrera carrera;
}
