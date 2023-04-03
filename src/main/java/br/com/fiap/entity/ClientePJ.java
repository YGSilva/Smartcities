package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.Table;

@Entity
@DiscriminatorValue("PJ")
//@Table(name="tb_cliente_pj")
public class ClientePJ extends Cliente {
	
	@Column(name="cnpj_cliente")
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}