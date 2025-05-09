package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_area")
    private UUID idArea;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "tarifa_predeterminada", nullable = false)
    private Double tarifaPredeterminada;
}

