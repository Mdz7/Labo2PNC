package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "empleado_mentor")
public class EmpleadoMentor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_empleado_mentor")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_mentor", nullable = false)
    private Empleado mentor;

    @ManyToOne
    @JoinColumn(name = "id_mentoreado", nullable = false)
    private Empleado mentoreado;
}
