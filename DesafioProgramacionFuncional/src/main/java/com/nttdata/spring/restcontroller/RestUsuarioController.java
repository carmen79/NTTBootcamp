package com.nttdata.spring.restcontroller;

import com.nttdata.spring.model.Usuario;
import com.nttdata.spring.services.UsuarioServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class RestUsuarioController {

    //**************************************
    // PROPIEDADES
    //**************************************
    @Autowired
    private UsuarioServiceI service;

    //**************************************
    // METODOS
    //**************************************

    @GetMapping
    public String getUsuarios(@RequestParam String userName, @RequestParam String password) {

        List<Usuario> listaUsuarios = service.listaUsuarios();
        Usuario usuario = listaUsuarios
                .stream()
                .filter(u -> u.getUserName().equals(userName) && u.getPassword().equals(password))
                .findFirst().get();
        return "Hola " + usuario.getNombre();
    }

}
