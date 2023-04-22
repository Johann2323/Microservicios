package com.msvusuarios.msvusuarios.services;

import com.msvusuarios.msvusuarios.models.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UsuarioService {
    List<Usuario> listar();
    Optional<Usuario> porId(Long id);

    Usuario guardar(Usuario usuario);
    void eliminar(long id);

    Optional<Usuario> porEmail(String email);

}
