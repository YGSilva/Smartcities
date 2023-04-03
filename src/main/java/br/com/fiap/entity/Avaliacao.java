package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_avaliacao")
@IdClass(AvaliacaoId.class)
public class Avaliacao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@JoinColumn(name="id_usuario")
	@ManyToOne(optional=false)
	private Usuario idUsuario;
	
	@Id
	@JoinColumn(name="id_estabelecimento")
	@ManyToOne(optional=false)
	private Estabelecimento idEstabelecimento;
	
	@Column(name="nota_avaliacao")
	private int nota;

	public Avaliacao() {
		super();
	}

	public Avaliacao(Usuario idUsuario, Estabelecimento idEstabelecimento, int nota) {
		super();
		this.idUsuario = idUsuario;
		this.idEstabelecimento = idEstabelecimento;
		this.nota = nota;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Estabelecimento getIdEstabelecimento() {
		return idEstabelecimento;
	}

	public void setIdEstabelecimento(Estabelecimento idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
