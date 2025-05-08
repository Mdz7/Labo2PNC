package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_cliente")
    private UUID idCliente;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "email_contacto", nullable = false)
    private String emailContacto;

    @ManyToOne
    @JoinColumn(name = "id_industria", nullable = false)
    private Industria industria;
}
