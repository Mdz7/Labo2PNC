package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "capacitacion")
public class Capacitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_capacitacion")
    private UUID idCapacitacion;

    @Column(name = "tema", nullable = false)
    private String tema;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "duracion_horas", nullable = false)
    private Integer duracionHoras;
}
