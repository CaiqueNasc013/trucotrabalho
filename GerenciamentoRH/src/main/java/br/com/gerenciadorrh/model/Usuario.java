package br.com.gerenciadorrh.model;

public class Usuario {

	private String Nome;
	private String Email;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Usuario(String nome, String email) {
		super();
		Nome = nome;
		Email = email;
	}
}
