package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tb_contrato_aluguel")
public class ContratoAluguel {

	@Id
	@SequenceGenerator(name="contrato_aluguel", sequenceName="sq_tb_contrato_aluguel", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="contrato_aluguel")
	@Column(name="id_contrato")
	private int idContrato;
	
	@Column(name="valor_contrato")
	private double valorContrato;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="data_contrato")
	private Calendar dataContrato;

	@OneToOne
	@JoinColumn(name="id_estabelecimento")
	private Estabelecimento estabelecimento;
	
	public ContratoAluguel() {
		super();
	}

	public ContratoAluguel(int idContrato, double valorContrato, Calendar dataContrato) {
		super();
		this.idContrato = idContrato;
		this.valorContrato = valorContrato;
		this.dataContrato = dataContrato;
	}

	public int getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}

	public double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public Calendar getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Calendar dataContrato) {
		this.dataContrato = dataContrato;
	}	
}
