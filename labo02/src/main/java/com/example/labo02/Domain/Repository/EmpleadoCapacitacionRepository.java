package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.EmpleadoCapacitacion;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

@Transactional
public interface EmpleadoCapacitacionRepository extends CrudRepository<EmpleadoCapacitacion, UUID> {

    List<EmpleadoCapacitacion> findByEmpleadoIdEmpleado(UUID idEmpleado);
}