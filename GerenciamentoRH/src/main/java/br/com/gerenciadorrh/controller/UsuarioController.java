package br.com.gerenciadorrh.controller;

import java.util.ArrayList;

import br.com.gerenciadorrh.model.Usuario;

public class UsuarioController {
	ArrayList<Usuario> usuarios;
	
	public void CadastrarUsuario(String Nome, String Email) {
		Usuario usuarioNovo =
				new Usuario(Nome, Email);
		usuarios.add(usuarioNovo);
	}

}
