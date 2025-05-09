package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Categoria;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

@Transactional
public interface CategoriaRepository extends CrudRepository<Categoria, UUID> {

    Categoria findByNombre(String nombre);
}