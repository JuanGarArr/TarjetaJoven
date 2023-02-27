package com.iesam.youthcard.Presentation;

import com.iesam.youthcard.Data.Local.UsuarioFileLocalDataSource;
import com.iesam.youthcard.Data.UsuarioDataRepository;
import com.iesam.youthcard.Domain.Models.Usuario;
import com.iesam.youthcard.Domain.UseCases.Usuario.AddUsuarioUseCase;
import com.iesam.youthcard.Domain.UseCases.Usuario.UsuarioRepository;

public class TerminalView {

    UsuarioRepository usuarioRepository = new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance());

    public void init(){
        Usuario usuario1 = new Usuario();

        usuario1.setId(1);
        usuario1.setNombre("Juan");
        usuario1.setApellidos("Garcia");
        usuario1.setDireccion("yeayeayeayea");

        Usuario usuario2 = new Usuario();

        usuario2.setId(1);
        usuario2.setNombre("Juan");
        usuario2.setApellidos("Garcia");
        usuario2.setDireccion("yeayeayeayea");


        AddUsuarioUseCase addUsuarioUseCase = new AddUsuarioUseCase(usuarioRepository);
        addUsuarioUseCase.execute(usuario1);
        addUsuarioUseCase.execute(usuario2);
    }
}
