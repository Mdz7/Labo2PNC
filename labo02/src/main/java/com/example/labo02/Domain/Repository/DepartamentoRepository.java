package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Departamento;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface DepartamentoRepository extends CrudRepository<Departamento, UUID> {

    @Query("SELECT d FROM Departamento d WHERE LOWER(d.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Departamento> buscarPorNombre(@Param("nombre") String nombre);
}