package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.EmpleadoProyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmpleadoProyectoRepository extends JpaRepository<EmpleadoProyecto, UUID> {
}