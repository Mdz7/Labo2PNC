package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tecnologia")
public class Tecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_tecnologia")
    private UUID idTecnologia;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "version", nullable = false)
    private String version;
}
