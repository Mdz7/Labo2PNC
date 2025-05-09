package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Cliente;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface ClienteRepository extends CrudRepository<Cliente, UUID> {

    Cliente findByRazonSocial(String razonSocial);

    @Query("SELECT c FROM Cliente c WHERE c.direccion LIKE %:direccion%")
    List<Cliente> findByDireccionContaining(@Param("direccion") String direccion);
}