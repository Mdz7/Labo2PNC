package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Departamento;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

@Transactional
public interface DepartamentoRepository extends CrudRepository<Departamento, UUID> {

    Departamento findByNombre(String nombre);
}