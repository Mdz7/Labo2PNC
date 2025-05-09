package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.EmpleadoMentor;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

@Transactional
public interface EmpleadoMentorRepository extends CrudRepository<EmpleadoMentor, UUID> {

    List<EmpleadoMentor> findByMentorIdEmpleado(UUID idMentor);
}