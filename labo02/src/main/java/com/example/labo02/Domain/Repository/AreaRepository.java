package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Area;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface AreaRepository extends CrudRepository<Area, UUID> {

    Area findByNombre(String nombre);

    @Query("SELECT a FROM Area a WHERE a.descripcion LIKE %:desc%")
    List<Area> findByDescripcionContaining(@Param("desc") String desc);
}