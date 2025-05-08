package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "industria")
public class Industria {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_industria")
    private UUID idIndustria;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;
}
