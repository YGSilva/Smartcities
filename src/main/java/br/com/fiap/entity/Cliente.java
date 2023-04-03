package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_pessoa")
@Table(name="tb_cliente")
public class Cliente {

	@Id
	@SequenceGenerator(name="cliente", sequenceName="sq_tb_cliente", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente")
	@Column(name="id_cliente")
	private int idCliente;
	
	@Column(name="nome_cliente")
	private String nomeCliente;

	public Cliente() {
		super();
	}

	@ManyToMany(mappedBy="clientes")
	private List<Estabelecimento> estabelecimento;
	
	public Cliente(int idCliente, String nomeCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
}
