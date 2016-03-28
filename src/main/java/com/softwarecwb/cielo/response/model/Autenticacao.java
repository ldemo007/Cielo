package com.softwarecwb.cielo.response.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.hibernate.validator.constraints.Length;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class Autenticacao {

	@Length(min = 1, max = 2)
	private int codigo;

	private String mensagem;

	private String dataHora;

	private String valor;

	private int eci;

	// SETTERS
	@XmlElement(name = "codigo")
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@XmlElement(name = "mensagem")
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@XmlElement(name = "data-hora")
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	@XmlElement(name = "valor")
	public void setValor(String valor) {
		StringBuilder stringBuilder = new StringBuilder(valor).insert(valor.length()-2,".");
		this.valor = stringBuilder.toString();
	}

	@XmlElement(name = "eci")
	public void setEci(int eci) {
		this.eci = eci;
	}

	// GETTERS
	public int getCodigo() {
		return codigo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public Date getDataHora() {
		return new Date(dataHora);
	}

	public Double getValor() {
		return Double.parseDouble(valor);
	}

	public int getEci() {
		return eci;
	}

}
