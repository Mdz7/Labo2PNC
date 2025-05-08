package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "puesto")
public class Puesto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_puesto")
    private UUID idPuesto;

    @Column(name = "nombre", nullable = false)
    private String nombre;
}
