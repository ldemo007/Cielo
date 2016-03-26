package com.softwarecwb.cielo.request.model.enumerador;

public enum Moeda {

	REAL(986);	
	
	private final int valor;

	private Moeda(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	
}
