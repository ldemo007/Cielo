package com.softwarecwb.cielo.request.model;

import java.io.Serializable;
import java.util.Optional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.Length;

import com.softwarecwb.cielo.request.model.enumerador.Indicador;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder={"numeroCartao","validade","indicador","codigoSeguranca","nomePortador","token"})
public class DadosPortador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max = 19)
	private String numeroCartao;

	@Length(max = 6, min = 6)
	private String validade;

	private Indicador indicador;

	@Length(min = 3, max = 4)
	private String codigoSeguranca;

	@Length(max = 50)
	private String nomePortador;

	@Length(max = 100)
	private Optional<String> token;

	public DadosPortador(String numeroCartao, String validade, Indicador indicador, String codigoSeguranca,
			String nomePortador, Optional<String> token) {
		this.numeroCartao = numeroCartao;
		this.validade = validade;
		this.indicador = indicador;
		this.codigoSeguranca = codigoSeguranca;
		this.nomePortador = nomePortador;
		this.token = token;
	}

	public DadosPortador() {
		// TODO Auto-generated constructor stub
	}

	// GETTERS
	@XmlElement(name = "numero")
	public String getNumeroCartao() {
		return numeroCartao;
	}

	@XmlElement(name = "indicador")
	public int getIndicador() {
		return indicador.getValor();
	}

	@XmlElement(name = "validade")
	public String getValidade() {
		return validade;
	}

	@XmlElement(name = "codigo-seguranca")
	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}

	@XmlElement(name = "nome-portador")
	public String getNomePortador() {
		return nomePortador;
	}

	@XmlElement(name = "token")
	public Optional<String> getToken() {
		return token;
	}

	// SETTERS
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public void setIndicador(Indicador indicador) {

		this.indicador = indicador;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public void setCodigoSeguranca(String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	public void setNomePortador(String nomePortador) {
		this.nomePortador = nomePortador;
	}

	public void setToken(Optional<String> token) {
		this.token = token;
	}

}
