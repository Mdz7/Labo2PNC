package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Industria;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

@Transactional
public interface IndustriaRepository extends CrudRepository<Industria, UUID> {

    Industria findByNombre(String nombre);
}