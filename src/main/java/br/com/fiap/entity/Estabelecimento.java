package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.Formula;

@Entity
@Table(name="tb_estabelecimento")
public class Estabelecimento {
	
	@Id
	@SequenceGenerator(name="estabelecimento", sequenceName="sq_tb_estabelecimento", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="estabelecimento")
	@Column(name="id_estabelecimento")
	private int idEstabelecimento;
	
	@Column(name="nome_estabelecimento")
	private String nomeEstabelecimento;
	
	@OneToOne(mappedBy="estabelecimento")
	private ContratoAluguel contratoAluguel;
	
	@ManyToOne
	@JoinColumn(name="id_tp_estabelecimento")
	private TipoEstabelecimento tipoEstabelecimento;
	
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn(name="id_estabelecimento"),
	inverseJoinColumns=@JoinColumn(name="id_cliente"),
	name="tb_cliente_estabelecimento")
	private List<Cliente> clientes;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_criacao")
	private Calendar dataCriacao;
	
	//@Formula("(SELECT AVG(A.NOTA)+1 FROM AVALIACAO A WHERE A.ID_ESTABELECIMENTO = ID.ESTABELECIMENTO)")
	@Column(name="media_avaliacoes")
	private Double mediaAvaliacoes;

	public Estabelecimento() {
		super();
	}

	public Estabelecimento(int idEstabelecimento, String nomeEstabelecimento, Calendar dataCriacao, Double mediaAvaliacoes) {
		super();
		this.idEstabelecimento = idEstabelecimento;
		this.nomeEstabelecimento = nomeEstabelecimento;
		this.dataCriacao = dataCriacao;
		this.mediaAvaliacoes = mediaAvaliacoes;
	}

	public int getId() {
		return idEstabelecimento;
	}

	public void setId(int id) {
		this.idEstabelecimento = id;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Double getMediaAvaliacoes() {
		return mediaAvaliacoes;
	}

	public void setMediaAvaliacoes(Double mediaAvaliacoes) {
		this.mediaAvaliacoes = mediaAvaliacoes;
	}
}