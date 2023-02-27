package com.iesam.youthcard.Domain.UseCases.Usuario;

import com.iesam.youthcard.Domain.Models.Usuario;

import java.util.List;

public interface UsuarioRepository {

    public void save(Usuario usuario);

    public List<Usuario> getAll();



}
