package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Puesto;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface PuestoRepository extends CrudRepository<Puesto, UUID> {

    @Query("SELECT p FROM Puesto p WHERE LOWER(p.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Puesto> buscarPorNombre(@Param("nombre") String nombre);
}