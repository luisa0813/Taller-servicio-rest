package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.model.Libro;
import com.biblioteca.Biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LibroController {
    @Autowired
    LibroService libroService;

    @PostMapping("/libro")
    private void crearYActualizarLibro(@RequestBody Libro libro){

        libroService.crearYActualizarLibro(libro);
    }
    @GetMapping ("/libro")
    private List<Libro> getAll() {

        return libroService.getLibros();
    }

    @GetMapping ("/libro/{id}")
    public Optional<Libro> getBId(@PathVariable("id") Long id){

        return libroService.getLibro(id);
    }

        @DeleteMapping("/libro/{id}")
        private void eliminarLibro(@PathVariable("id") long id){

        libroService.eliminarLibro(id);
        }
        @PutMapping("/libro")
        private void editarLibro(@RequestBody Libro libro){
            libroService.crearYActualizarLibro(libro);

        }

    }





