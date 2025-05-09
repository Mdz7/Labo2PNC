package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Departamento;
import com.example.labo02.Domain.Entities.Empleado;
import com.example.labo02.Domain.Entities.Puesto;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Transactional
public interface EmpleadoRepository extends CrudRepository<Empleado, UUID> {

    @Query("SELECT e FROM Empleado e WHERE LOWER(e.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Empleado> buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT e FROM Empleado e WHERE LOWER(e.apellido) LIKE LOWER(CONCAT('%', :apellido, '%'))")
    List<Empleado> buscarPorApellido(@Param("apellido") String apellido);

    @Query("SELECT e FROM Empleado e WHERE LOWER(e.email) LIKE LOWER(CONCAT('%', :email, '%'))")
    List<Empleado> buscarPorEmail(@Param("email") String email);

    @Query("SELECT e FROM Empleado e WHERE e.departamento = :departamento")
    List<Empleado> buscarPorDepartamento(@Param("departamento") Departamento departamento);

    @Query("SELECT e FROM Empleado e WHERE e.puesto = :puesto")
    List<Empleado> buscarPorPuesto(@Param("puesto") Puesto puesto);

    @Query("SELECT e FROM Empleado e WHERE e.fechaIngreso BETWEEN :inicio AND :fin")
    List<Empleado> buscarPorFechaIngresoEntre(@Param("inicio") LocalDate inicio, @Param("fin") LocalDate fin);
}