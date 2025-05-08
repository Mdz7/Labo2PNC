package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "evaluacion")
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_evaluacion")
    private UUID idEvaluacion;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "puntaje", nullable = false)
    private Integer puntaje;

    @Column(name = "comentarios")
    private String comentarios;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false)
    private Empleado empleado;
}
