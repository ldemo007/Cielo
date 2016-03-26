package com.softwarecwb.cielo.request.model;

import java.io.Serializable;
import java.util.Optional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.Length;

import com.softwarecwb.cielo.request.model.enumerador.Bandeira;
import com.softwarecwb.cielo.request.model.enumerador.CodigoProduto;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder={"bandeira","codigoProduto","numeroParcelas"})
public class FormaPagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Bandeira bandeira;

	private Optional<CodigoProduto> codigoProduto;

	@Length(min = 1, max = 2)
	private int numeroParcelas;

	public FormaPagamento(Bandeira bandeira, CodigoProduto codigoProduto, int numeroParcelas) {
		this.bandeira = bandeira;
		this.codigoProduto = Optional.ofNullable(codigoProduto);
		this.numeroParcelas = numeroParcelas;
	}

	public FormaPagamento() {
		// TODO Auto-generated constructor stub
	}

	// GETTERS
	@XmlElement(name = "bandeira")
	public Bandeira getBandeira() {
		return bandeira;
	}

	@XmlElement(name = "produto")
	public String getCodigoProduto() {
		return codigoProduto.orElse(CodigoProduto.CODIGO_A_VISTA).getValor();
	}

	@XmlElement(name = "parcelas")
	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	// SETTERS
	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

	public void setCodigoProduto(CodigoProduto codigoProduto) {
		this.codigoProduto = Optional.ofNullable(codigoProduto);
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

}
