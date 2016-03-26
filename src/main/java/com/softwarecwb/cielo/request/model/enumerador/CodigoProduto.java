package com.softwarecwb.cielo.request.model.enumerador;

public enum CodigoProduto {

	CODIGO_A_VISTA("1"),PARCELADO_LOJA("2"),DEBITO("A");
	
	private final String valor;

	private CodigoProduto(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
}
