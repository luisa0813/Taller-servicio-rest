package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.model.Libro;
import com.biblioteca.Biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class LibroService {
 @Autowired
    LibroRepository libroRepository;
   public void crearYActualizarLibro(Libro libro){

        libroRepository.save(libro);

    }

    public List<Libro> getLibros(){

       return libroRepository.findAll();
    }

    public Optional<Libro> getLibro(long id){

       return libroRepository.findById(id);
    }

    public void eliminarLibro(Long id){

       libroRepository.deleteById(id);
    }


}





