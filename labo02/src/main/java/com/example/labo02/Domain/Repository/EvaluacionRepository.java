package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Evaluacion;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

@Transactional
public interface EvaluacionRepository extends CrudRepository<Evaluacion, UUID> {

    List<Evaluacion> findByEmpleadoIdEmpleado(UUID idEmpleado);
}