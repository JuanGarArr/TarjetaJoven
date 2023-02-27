package com.iesam.youthcard.Domain.UseCases.Promociones;

import com.iesam.youthcard.Domain.Models.Usuario;

import java.util.List;

public class GetPromocionesUseCase {

    private PromocionesRepository promocionesRepository;

    public GetPromocionesUseCase(PromocionesRepository promocionesRepository) {
        this.promocionesRepository = promocionesRepository;
    }

    public List<Usuario> execute(){
        return this.promocionesRepository.getAll();
    }
}
