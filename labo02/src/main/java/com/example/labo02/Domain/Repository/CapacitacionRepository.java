package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Capacitacion;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Transactional
public interface CapacitacionRepository extends CrudRepository<Capacitacion, UUID> {

    @Query("SELECT c FROM Capacitacion c WHERE LOWER(c.tema) LIKE LOWER(CONCAT('%', :tema, '%'))")
    List<Capacitacion> buscarPorTema(@Param("tema") String tema);

    @Query("SELECT c FROM Capacitacion c WHERE c.fecha BETWEEN :inicio AND :fin")
    List<Capacitacion> buscarPorFechaEntre(@Param("inicio") LocalDate inicio, @Param("fin") LocalDate fin);

    @Query("SELECT c FROM Capacitacion c WHERE c.duracionHoras <= :duracion")
    List<Capacitacion> buscarPorDuracionMenorIgual(@Param("duracion") Integer duracion);
}