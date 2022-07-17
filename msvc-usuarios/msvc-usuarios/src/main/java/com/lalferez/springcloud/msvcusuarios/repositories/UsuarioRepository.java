package com.lalferez.springcloud.msvcusuarios.repositories;

import com.lalferez.springcloud.msvcusuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
