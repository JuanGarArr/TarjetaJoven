package com.iesam.youthcard.Domain.UseCases;

import com.iesam.youthcard.Domain.Models.Usuario;

public class GetUsuarioUseCase {

    private UsuarioRepository usuarioRepository;

    public GetUsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario execute(Integer usuarioId) {
        return this.usuarioRepository.getById(usuarioId);
    }
}
