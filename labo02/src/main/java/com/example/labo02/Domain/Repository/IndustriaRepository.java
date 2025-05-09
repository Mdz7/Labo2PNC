package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Industria;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface IndustriaRepository extends CrudRepository<Industria, UUID> {

    @Query("SELECT i FROM Industria i WHERE LOWER(i.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Industria> buscarPorNombre(@Param("nombre") String nombre);
}