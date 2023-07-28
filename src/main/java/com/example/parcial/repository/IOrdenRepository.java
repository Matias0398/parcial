package com.example.parcial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.parcial.entidad.Orden;
import com.example.parcial.entidad.Usuario;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer>{
	List<Orden> findByUsuario (Usuario usuario);
}
