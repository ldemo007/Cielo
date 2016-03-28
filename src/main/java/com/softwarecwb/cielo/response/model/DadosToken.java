package com.softwarecwb.cielo.response.model;

public class DadosToken {

	private String codigoToken;
	
	private int status;
	
	private String numeroCartaoTruncado;

	public String getCodigoToken() {
		return codigoToken;
	}

	public void setCodigoToken(String codigoToken) {
		this.codigoToken = codigoToken;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getNumeroCartaoTruncado() {
		return numeroCartaoTruncado;
	}

	public void setNumeroCartaoTruncado(String numeroCartaoTruncado) {
		this.numeroCartaoTruncado = numeroCartaoTruncado;
	}
	
	
}
