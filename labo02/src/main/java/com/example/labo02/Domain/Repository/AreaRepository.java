package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Area;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface AreaRepository extends JpaRepository<Area, UUID> {

    @Query("SELECT a FROM Area a WHERE LOWER(a.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Area> buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT a FROM Area a WHERE a.tarifaPredeterminada <= :tarifa")
    List<Area> buscarPorTarifaMenorIgual(@Param("tarifa") Double tarifa);

    @Query("SELECT a FROM Area a WHERE a.tarifaPredeterminada BETWEEN :min AND :max")
    List<Area> buscarPorTarifaEntre(@Param("min") Double minimo, @Param("max") Double maximo);
}