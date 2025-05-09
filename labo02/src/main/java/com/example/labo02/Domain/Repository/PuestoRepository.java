package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Puesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PuestoRepository extends JpaRepository<Puesto, UUID> {
}