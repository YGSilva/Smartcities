package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.Table;

@Entity
@DiscriminatorValue("PF")
//@Table(name="tb_cliente_pf")
public class ClientePF extends Cliente {
	
	@Column(name="cpf_cliente")
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
