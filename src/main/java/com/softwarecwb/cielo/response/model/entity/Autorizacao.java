package com.softwarecwb.cielo.response.model.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.hibernate.validator.constraints.Length;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class Autorizacao {

	@Length(min = 1, max = 2)
	private int codigo;

	private String mensagem;

	private Date dataHora;

	private String valor;

	private int lr;

	private int arp;

	private int nsu;

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

	@XmlElement(name = "lr")
	public void setLr(int lr) {
		this.lr = lr;
	}

	@XmlElement(name = "arp")
	public void setArp(int arp) {
		this.arp = arp;
	}

	@XmlElement(name = "nsu")
	public void setNsu(int nsu) {
		this.nsu = nsu;
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

	public int getLr() {
		return lr;
	}

	public int getArp() {
		return arp;
	}

	public int getNsu() {
		return nsu;
	}
}
