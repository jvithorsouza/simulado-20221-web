package br.com.mariojp.condominio.model;

public class Usuario {
	
	
	public Usuario() {
		
	}

	public Usuario(String login, String senha) {

		this.login = login;
		this.senha = senha;
	}

	private String login;
	private String senha;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
