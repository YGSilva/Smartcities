package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@SequenceGenerator(name="produto", sequenceName="sq_tb_produto", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="produto")
	@Column(name="cd_produto")
	private int id;
	
	@Column(name="nm_produto", nullable=false, length=100)
	private String nome;
	
	@Column(name="vl_preco")
	private double preco;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_data_validade")
	private Calendar dataValidade;
	
	@Enumerated(EnumType.STRING)
	private Estado estado;

	
	public Produto() {
		super();
	}

	public Produto(int id, String nome, double preco, Calendar dataValidade, Estado estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.estado = estado;
	}

	public int getId() {
		return id;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}	
	
	
}
