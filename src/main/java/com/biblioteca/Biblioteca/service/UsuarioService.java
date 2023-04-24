package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.model.Libro;
import com.biblioteca.Biblioteca.model.Usuario;
import com.biblioteca.Biblioteca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsuarioService {
 @Autowired
    UsuarioRepository usuarioRepository;
   public void crearYActualizarUsuario(Usuario usuario){

        usuarioRepository.save(usuario);
    }

    public List<Usuario> getUsuarios() {

        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getUsuario(Long id){

        return usuarioRepository.findById(id);
    }
    public void eliminarUsuario(Long id){

        usuarioRepository.deleteById(id);
    }
    public void validaguardar(String autor){

   }






}





