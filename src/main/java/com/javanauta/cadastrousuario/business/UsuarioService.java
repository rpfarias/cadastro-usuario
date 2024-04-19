package com.javanauta.cadastrousuario.business;

import com.javanauta.cadastrousuario.infrastructure.entities.UsuarioEntity;
import com.javanauta.cadastrousuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    //private final UsuarioConverter usuarioConverter;
    //private final UsuarioUpdateMapper usuarioUpdateMapper;
    //private final UsuarioMapper usuarioMapper;

    public UsuarioEntity salvaUsuario(UsuarioEntity usuarioEntity) {
        return usuarioRepository.saveAndFlush(usuarioEntity);
    }


}
