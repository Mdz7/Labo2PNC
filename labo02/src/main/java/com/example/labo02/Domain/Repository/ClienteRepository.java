package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Cliente;
import com.example.labo02.Domain.Entities.Industria;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface ClienteRepository extends CrudRepository<Cliente, UUID> {

    @Query("SELECT c FROM Cliente c WHERE LOWER(c.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Cliente> buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT c FROM Cliente c WHERE c.industria = :industria")
    List<Cliente> buscarPorIndustria(@Param("industria") Industria industria);

    @Query("SELECT c FROM Cliente c WHERE LOWER(c.emailContacto) LIKE LOWER(CONCAT('%', :email, '%'))")
    List<Cliente> buscarPorEmail(@Param("email") String email);
}