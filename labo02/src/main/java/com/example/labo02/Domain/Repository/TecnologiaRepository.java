package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Tecnologia;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

@Transactional
public interface TecnologiaRepository extends CrudRepository<Tecnologia, UUID> {

    Tecnologia findByNombre(String nombre);
}