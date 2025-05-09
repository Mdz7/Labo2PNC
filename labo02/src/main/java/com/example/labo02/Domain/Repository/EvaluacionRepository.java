package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Evaluacion;
import com.example.labo02.Domain.Entities.Empleado;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Transactional
public interface EvaluacionRepository extends CrudRepository<Evaluacion, UUID> {

    @Query("SELECT e FROM Evaluacion e WHERE e.empleado = :empleado")
    List<Evaluacion> buscarPorEmpleado(@Param("empleado") Empleado empleado);

    @Query("SELECT e FROM Evaluacion e WHERE e.fecha BETWEEN :inicio AND :fin")
    List<Evaluacion> buscarPorFechaEntre(@Param("inicio") LocalDate inicio, @Param("fin") LocalDate fin);

    @Query("SELECT e FROM Evaluacion e WHERE e.puntaje >= :puntaje")
    List<Evaluacion> buscarPorPuntajeMayorIgual(@Param("puntaje") Integer puntaje);
}