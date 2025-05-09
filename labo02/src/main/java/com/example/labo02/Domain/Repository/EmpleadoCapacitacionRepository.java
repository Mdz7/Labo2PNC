package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Capacitacion;
import com.example.labo02.Domain.Entities.Empleado;
import com.example.labo02.Domain.Entities.EmpleadoCapacitacion;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface EmpleadoCapacitacionRepository extends CrudRepository<EmpleadoCapacitacion, UUID> {

    @Query("SELECT ec FROM EmpleadoCapacitacion ec WHERE ec.empleado = :empleado")
    List<EmpleadoCapacitacion> buscarPorEmpleado(@Param("empleado") Empleado empleado);

    @Query("SELECT ec FROM EmpleadoCapacitacion ec WHERE ec.capacitacion = :capacitacion")
    List<EmpleadoCapacitacion> buscarPorCapacitacion(@Param("capacitacion") Capacitacion capacitacion);
}