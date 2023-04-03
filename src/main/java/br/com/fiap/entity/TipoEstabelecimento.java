 package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_tipo_estabelecimento")
public class TipoEstabelecimento {

	@Id
	@SequenceGenerator(name="tp_estabecimento", sequenceName="sq_tp_estabecimento", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tp_estabecimento")
	@Column(name="id_tp_relacionamento")
	private int id;
	
	@Column(name="nome_tp_estabelecimento", nullable=false)
	private String nome;

	@OneToMany(mappedBy="tipoEstabelecimento")
	private List<Estabelecimento> estabelecimento;
	
	public int getId() {
		return id;
	}
	
	public TipoEstabelecimento() {
		super();
	}

	public TipoEstabelecimento(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
