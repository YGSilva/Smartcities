package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Objects;

public class AvaliacaoId implements Serializable{
	private static final long serialVersionUID = 1L;

	private int idUsuario;
	
	private int idEstabelecimento;

	public AvaliacaoId() {
		super();
	}

	public AvaliacaoId(int idUsuario, int idEstabelecimento) {
		super();
		this.idUsuario = idUsuario;
		this.idEstabelecimento = idEstabelecimento;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdEstabelecimento() {
		return idEstabelecimento;
	}

	public void setIdEstabelecimento(int idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEstabelecimento, idUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvaliacaoId other = (AvaliacaoId) obj;
		return idEstabelecimento == other.idEstabelecimento && idUsuario == other.idUsuario;
	}
}
