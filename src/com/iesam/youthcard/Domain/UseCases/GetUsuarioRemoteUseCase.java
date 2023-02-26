package com.iesam.youthcard.Domain.UseCases;

import com.iesam.youthcard.Domain.Models.Usuario;

import java.util.List;

public class GetUsuarioRemoteUseCase {


        private UsuarioRepository usuarioRepository;

        public GetUsuarioRemoteUseCase(UsuarioRepository usuarioRepository) {
            this.usuarioRepository = usuarioRepository;
        }

        public List<Usuario> execute() {
            return this.usuarioRepository.getAllWithRemote();
        }
}
