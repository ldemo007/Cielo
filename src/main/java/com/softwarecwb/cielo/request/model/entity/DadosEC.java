package com.softwarecwb.cielo.request.model.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.Length;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = { "numeroEstabelecimento", "chave" })
public class DadosEC implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DadosEC(String numeroEstabelecimento, String chave) {
		this.numeroEstabelecimento = numeroEstabelecimento;
		this.chave = chave;
	}

	public DadosEC() {
		// TODO Auto-generated constructor stub
	}

	@Length(max = 20)
	private String numeroEstabelecimento;

	@Length(max = 100)
	private String chave;

	// SETTERS
	@XmlElement(name = "numero")
	public void setNumeroEstabelecimento(String numeroEstabelecimento) {
		this.numeroEstabelecimento = numeroEstabelecimento;
	}

	@XmlElement(name = "chave")
	public void setChave(String chave) {
		this.chave = chave;
	}
	
	// GETTERS
	public String getNumeroEstabelecimento() {
		return numeroEstabelecimento;
	}

	public String getChave() {
		return chave;
	}

}
