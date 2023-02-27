package com.iesam.youthcard.Data;

import com.iesam.youthcard.Data.Local.UsuarioFileLocalDataSource;
import com.iesam.youthcard.Domain.Models.Promociones;
import com.iesam.youthcard.Domain.Models.Usuario;
import com.iesam.youthcard.Domain.UseCases.Promociones.PromocionesRepository;

import java.util.List;

public class PromocionesDataRepository implements PromocionesRepository {

    private UsuarioFileLocalDataSource localDataSource;

    public PromocionesDataRepository(UsuarioFileLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }


    @Override
    public void save(Promociones promociones) {

    }

    @Override
    public List<Usuario> getAll() {
        return null;
    }
}
