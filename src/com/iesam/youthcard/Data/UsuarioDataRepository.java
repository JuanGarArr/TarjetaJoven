package com.iesam.youthcard.Data;

import com.iesam.youthcard.Data.Local.UsuarioFileLocalDataSource;
import com.iesam.youthcard.Domain.Models.Usuario;
import com.iesam.youthcard.Domain.UseCases.Usuario.UsuarioRepository;

import java.util.List;

public class UsuarioDataRepository implements UsuarioRepository {

    private UsuarioFileLocalDataSource localDataSource;

    public UsuarioDataRepository(UsuarioFileLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }


    @Override
    public void save(Usuario usuario) {

    }

    @Override
    public List<Usuario> getAll() {
        return null;
    }
}
