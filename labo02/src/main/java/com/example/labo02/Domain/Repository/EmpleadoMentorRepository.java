package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Empleado;
import com.example.labo02.Domain.Entities.EmpleadoMentor;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface EmpleadoMentorRepository extends CrudRepository<EmpleadoMentor, UUID> {

    @Query("SELECT em FROM EmpleadoMentor em WHERE em.mentor = :mentor")
    List<EmpleadoMentor> buscarPorMentor(@Param("mentor") Empleado mentor);

    @Query("SELECT em FROM EmpleadoMentor em WHERE em.mentoreado = :mentoreado")
    List<EmpleadoMentor> buscarPorMentoreado(@Param("mentoreado") Empleado mentoreado);
}