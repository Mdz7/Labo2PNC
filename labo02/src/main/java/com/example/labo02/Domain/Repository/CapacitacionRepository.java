package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Capacitacion;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Transactional
public interface CapacitacionRepository extends CrudRepository<Capacitacion, UUID> {

    List<Capacitacion> findByNombre(String nombre);

    @Query("SELECT c FROM Capacitacion c WHERE c.fecha BETWEEN :inicio AND :fin")
    List<Capacitacion> findByFechaBetween(@Param("inicio") Date inicio, @Param("fin") Date fin);
}