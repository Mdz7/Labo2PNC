package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.EmpleadoProyecto;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

@Transactional
public interface EmpleadoProyectoRepository extends CrudRepository<EmpleadoProyecto, UUID> {

    List<EmpleadoProyecto> findByEmpleadoIdEmpleado(UUID idEmpleado);
}