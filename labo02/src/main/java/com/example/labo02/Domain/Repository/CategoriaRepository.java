package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Area;
import com.example.labo02.Domain.Entities.Categoria;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface CategoriaRepository extends CrudRepository<Categoria, UUID> {

    @Query("SELECT c FROM Categoria c WHERE LOWER(c.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Categoria> buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT c FROM Categoria c WHERE c.area = :area")
    List<Categoria> buscarPorArea(@Param("area") Area area);
}