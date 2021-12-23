package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.nttdata.spring.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioServiceI {

	@Override
	public List<Usuario> listaUsuarios() {

		Usuario u1 = new Usuario(1L, "Carmen", "carmenBueno", "1234");
		Usuario u2 = new Usuario(2L, "Jorge", "jorgePerez", "1234");
		Usuario u3 = new Usuario(3L, "Hugo", "hugoMatos", "1234");
		Usuario u4 = new Usuario(4L, "Leo", "leoRando", "1234");

		return List.of(u1, u2, u3, u4);
	}
}
