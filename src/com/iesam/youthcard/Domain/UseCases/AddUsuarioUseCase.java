package com.iesam.youthcard.Domain.UseCases;

import com.iesam.youthcard.Domain.Models.Usuario;

public class AddUsuarioUseCase {


    public class AddCatUseCase {

        private UsuarioRepository usuarioRepository;

        public AddCatUseCase(UsuarioRepository usuarioRepository) {
            this.usuarioRepository = usuarioRepository;
        }

        public void execute(Usuario usuario) {
            this.usuarioRepository.save(usuario);
        }

    }
}
