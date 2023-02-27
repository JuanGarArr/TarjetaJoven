package com.iesam.youthcard.Domain.UseCases.Promociones;

import com.iesam.youthcard.Domain.Models.Promociones;
import com.iesam.youthcard.Domain.Models.Usuario;

import java.util.List;


public interface PromocionesRepository {

    public void save(Promociones promociones);
    public List<Usuario> getAll();
}
