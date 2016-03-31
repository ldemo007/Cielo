package com.softwarecwb.cielo.response.model.entity;

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

	private Date dataHora;

	private String valor;

	private int eci;

	public Autenticacao() {
		// TODO Auto-generated constructor stub
	}
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
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	@XmlElement(name = "valor")
	public void setValor(String valor) {
		this.valor = valor;
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
		return dataHora;
	}

	public String getValor() {
		return valor;
	}

	public int getEci() {
		return eci;
	}

}
