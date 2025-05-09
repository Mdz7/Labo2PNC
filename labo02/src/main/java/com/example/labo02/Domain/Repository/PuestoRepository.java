package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Puesto;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

@Transactional
public interface PuestoRepository extends CrudRepository<Puesto, UUID> {

    Puesto findByNombre(String nombre);
}