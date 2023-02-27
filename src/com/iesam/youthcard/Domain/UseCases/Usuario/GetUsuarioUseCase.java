package com.iesam.youthcard.Domain.UseCases.Usuario;

import com.iesam.youthcard.Domain.Models.Usuario;

import java.util.List;

public class GetUsuarioUseCase {

    private UsuarioRepository usuarioRepository;

    public GetUsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> execute(){
        return this.usuarioRepository.getAll();
    }

}
