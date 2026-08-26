package com.java.usuario.business;

import com.java.usuario.business.converter.UsuarioConverter;
import com.java.usuario.business.dto.UsuarioDTO;
import com.java.usuario.entity.Usuario;
import com.java.usuario.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO){

        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        usuario =  usuarioRepository.save(usuario);
        return usuarioConverter.paraUsuarioDTO(usuario);
    }
}
