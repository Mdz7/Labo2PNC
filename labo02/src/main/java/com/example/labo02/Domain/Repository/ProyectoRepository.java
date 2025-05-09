package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Area;
import com.example.labo02.Domain.Entities.Categoria;
import com.example.labo02.Domain.Entities.Cliente;
import com.example.labo02.Domain.Entities.Empleado;
import com.example.labo02.Domain.Entities.Proyecto;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface ProyectoRepository extends CrudRepository<Proyecto, UUID> {

    @Query("SELECT p FROM Proyecto p WHERE LOWER(p.codigo) LIKE LOWER(CONCAT('%', :codigo, '%'))")
    List<Proyecto> buscarPorCodigo(@Param("codigo") String codigo);

    @Query("SELECT p FROM Proyecto p WHERE LOWER(p.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Proyecto> buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT p FROM Proyecto p WHERE p.area = :area")
    List<Proyecto> buscarPorArea(@Param("area") Area area);

    @Query("SELECT p FROM Proyecto p WHERE p.categoria = :categoria")
    List<Proyecto> buscarPorCategoria(@Param("categoria") Categoria categoria);

    @Query("SELECT p FROM Proyecto p WHERE p.cliente = :cliente")
    List<Proyecto> buscarPorCliente(@Param("cliente") Cliente cliente);

    @Query("SELECT p FROM Proyecto p WHERE p.lider = :lider")
    List<Proyecto> buscarPorLider(@Param("lider") Empleado lider);
}