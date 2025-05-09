package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Proyecto;
import com.example.labo02.Domain.Entities.ProyectoTecnologia;
import com.example.labo02.Domain.Entities.Tecnologia;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface ProyectoTecnologiaRepository extends CrudRepository<ProyectoTecnologia, UUID> {

    @Query("SELECT pt FROM ProyectoTecnologia pt WHERE pt.proyecto = :proyecto")
    List<ProyectoTecnologia> buscarPorProyecto(@Param("proyecto") Proyecto proyecto);

    @Query("SELECT pt FROM ProyectoTecnologia pt WHERE pt.tecnologia = :tecnologia")
    List<ProyectoTecnologia> buscarPorTecnologia(@Param("tecnologia") Tecnologia tecnologia);
}