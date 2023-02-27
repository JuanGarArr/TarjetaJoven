package com.iesam.youthcard.Domain.UseCases.Promociones;

import com.iesam.youthcard.Domain.Models.Promociones;
import com.iesam.youthcard.Domain.Models.Usuario;
import com.iesam.youthcard.Domain.UseCases.Usuario.UsuarioRepository;

public class AddPromocionesUseCase {

    private PromocionesRepository promocionesRepository;

    public void AddPromocionesUseCase(PromocionesRepository promocionesRepository) {
        this.promocionesRepository = promocionesRepository;
    }

    public void execute(Promociones promociones) {
        this.promocionesRepository.save(promociones);
    }
}
