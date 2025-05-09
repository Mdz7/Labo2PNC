package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Empleado;
import com.example.labo02.Domain.Entities.EmpleadoProyecto;
import com.example.labo02.Domain.Entities.Proyecto;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface EmpleadoProyectoRepository extends CrudRepository<EmpleadoProyecto, UUID> {

    @Query("SELECT ep FROM EmpleadoProyecto ep WHERE ep.empleado = :empleado")
    List<EmpleadoProyecto> buscarPorEmpleado(@Param("empleado") Empleado empleado);

    @Query("SELECT ep FROM EmpleadoProyecto ep WHERE ep.proyecto = :proyecto")
    List<EmpleadoProyecto> buscarPorProyecto(@Param("proyecto") Proyecto proyecto);
}