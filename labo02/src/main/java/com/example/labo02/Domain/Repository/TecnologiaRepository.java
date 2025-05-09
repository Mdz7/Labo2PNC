package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Tecnologia;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface TecnologiaRepository extends CrudRepository<Tecnologia, UUID> {

    @Query("SELECT t FROM Tecnologia t WHERE LOWER(t.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Tecnologia> buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT t FROM Tecnologia t WHERE LOWER(t.version) LIKE LOWER(CONCAT('%', :version, '%'))")
    List<Tecnologia> buscarPorVersion(@Param("version") String version);
}