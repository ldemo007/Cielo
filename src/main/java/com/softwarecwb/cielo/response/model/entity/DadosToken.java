package com.softwarecwb.cielo.response.model.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.softwarecwb.cielo.response.model.enumerator.StatusDoToken;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class DadosToken {

	private String codigoToken;

	private StatusDoToken status;

	private String numeroCartaoTruncado;

	@XmlElement(name = "codigo-token")
	public void setCodigoToken(String codigoToken) {
		this.codigoToken = codigoToken;
	}

	@XmlElement(name = "status")
	public void setStatus(StatusDoToken status) {
		this.status = status;
	}

	@XmlElement(name = "numero-cartao-truncado")
	public void setNumeroCartaoTruncado(String numeroCartaoTruncado) {
		this.numeroCartaoTruncado = numeroCartaoTruncado;
	}

	public String getCodigoToken() {
		return codigoToken;
	}

	public StatusDoToken getStatus() {
		return status;
	}

	public String getNumeroCartaoTruncado() {
		return numeroCartaoTruncado;
	}

}
