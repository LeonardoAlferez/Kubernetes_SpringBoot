package com.lalferez.springcloud.msvcusuarios.services;

import com.lalferez.springcloud.msvcusuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listar();
    Optional<Usuario> byId(Long id);
    Usuario save(Usuario usuario);
    void delete(Long id);


}
