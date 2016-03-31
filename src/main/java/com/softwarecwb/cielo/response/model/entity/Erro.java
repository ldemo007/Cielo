package com.softwarecwb.cielo.response.model.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.softwarecwb.cielo.response.action.RespostaTransacao;

@XmlRootElement(name = "erro", namespace = "http://ecommerce.cbmp.com.br")
public class Erro extends RespostaTransacao {

	public Erro() {
		super();
	}

	private String codigo;

	private String mensagem;

	@XmlElement(name = "codigo")
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@XmlElement(name = "mensagem")
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getMensagem() {
		return mensagem;
	}

}
