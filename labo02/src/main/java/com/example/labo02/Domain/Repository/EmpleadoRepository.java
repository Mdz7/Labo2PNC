package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Empleado;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface EmpleadoRepository extends CrudRepository<Empleado, UUID> {

    Empleado findByEmail(String email);

    @Query("SELECT e FROM Empleado e WHERE e.departamento.idDepartamento = :idDepto")
    List<Empleado> findByDepartamentoId(@Param("idDepto") UUID idDepartamento);
}