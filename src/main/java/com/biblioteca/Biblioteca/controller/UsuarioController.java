package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.model.Usuario;
import com.biblioteca.Biblioteca.repository.UsuarioRepository;
import com.biblioteca.Biblioteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/usuario")
    private void crearYActualizarUsuario(@RequestBody Usuario usuario){
        usuarioService.crearYActualizarUsuario(usuario);
    }
    @GetMapping("/usuario")
    private List<Usuario> getAll() {

        return usuarioService.getUsuarios();
    }
        @DeleteMapping("/usuario/{id}")
        private void eeliminarUsuario(@PathVariable("id") long id){

        usuarioService.eliminarUsuario(id);
        }
        @PutMapping("/usuario")
        private void editarUsuario(@RequestBody Usuario usuario){
            usuarioService.crearYActualizarUsuario(usuario);

        }

    }





