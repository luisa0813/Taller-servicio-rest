package com.biblioteca.Biblioteca.repository;

import com.biblioteca.Biblioteca.model.Libro;
import com.biblioteca.Biblioteca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {



}

