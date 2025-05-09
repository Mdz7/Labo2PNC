package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Proyecto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface ProyectoRepository extends CrudRepository<Proyecto, UUID> {

    Proyecto findByNombre(String nombre);

    @Query("SELECT p FROM Proyecto p WHERE p.area.nombre = :nombreArea")
    List<Proyecto> findByAreaNombre(@Param("nombreArea") String nombreArea);
}