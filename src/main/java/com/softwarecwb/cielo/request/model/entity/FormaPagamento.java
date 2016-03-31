package com.softwarecwb.cielo.request.model.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.Length;

import com.softwarecwb.cielo.request.model.enumerador.Bandeira;
import com.softwarecwb.cielo.request.model.enumerador.CodigoProduto;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = { "bandeira", "codigoProduto", "numeroParcelas" })
public class FormaPagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Bandeira bandeira;

	private CodigoProduto codigoProduto;

	@Length(min = 1, max = 2)
	private int numeroParcelas;

	public FormaPagamento(Bandeira bandeira, CodigoProduto codigoProduto, int numeroParcelas) {
		this.bandeira = bandeira;
		this.codigoProduto = codigoProduto;
		this.numeroParcelas = numeroParcelas;
	}

	public FormaPagamento() {
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "bandeira")
	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

	@XmlElement(name = "produto")
	public void setCodigoProduto(CodigoProduto codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	@XmlElement(name = "parcelas")
	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public CodigoProduto getCodigoProduto() {
		return codigoProduto;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	
}
