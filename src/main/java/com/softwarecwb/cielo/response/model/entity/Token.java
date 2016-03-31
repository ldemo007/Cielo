package com.softwarecwb.cielo.response.model.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class Token {

	private DadosToken dadosToken;

	@XmlElement(name = "dados-token")
	public void setDadosToken(DadosToken dadosToken) {
		this.dadosToken = dadosToken;
	}
	
	public DadosToken getDadosToken() {
		return dadosToken;
	}

}
