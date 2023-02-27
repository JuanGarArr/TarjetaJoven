package com.iesam.youthcard.Domain.UseCases.Usuario;

import com.iesam.youthcard.Domain.Models.Usuario;

public class AddUsuarioUseCase {

        private UsuarioRepository usuarioRepository;

    public AddUsuarioUseCase(UsuarioRepository usuarioRepository) {
    }

    public void AddUsuarioUseCase(UsuarioRepository usuarioRepository) {
            this.usuarioRepository = usuarioRepository;
        }

        public void execute(Usuario usuario) {
            this.usuarioRepository.save(usuario);
        }


}
