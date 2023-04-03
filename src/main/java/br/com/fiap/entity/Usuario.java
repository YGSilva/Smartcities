package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
	@Id
	@SequenceGenerator(name="usuario", sequenceName="sq_tb_usuario", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usuario")
	@Column(name="id_usuario")
	private int idUsuario;
	
	@Column(name="nome_usuario")
	private String nome;
	
	@Column(name="senha_usuario")
	private String senha;
	
	@Column(name="usuario")
	private String usuario;

	public Usuario() {
		super();
	}

	public Usuario(int idUsuario, String nome, String senha, String usuario) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.senha = senha;
		this.usuario = usuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}
