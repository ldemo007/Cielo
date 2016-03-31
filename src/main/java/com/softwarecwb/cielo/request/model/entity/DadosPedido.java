package com.softwarecwb.cielo.request.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.Length;

import com.softwarecwb.cielo.request.model.enumerador.Idioma;
import com.softwarecwb.cielo.request.model.enumerador.Moeda;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = { "numeroPedido", "valor", "moeda", "dataHora", "descricao", "idioma", "taxaEmbarque",
		"softDescriptor" })
public class DadosPedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max = 20)
	private String numeroPedido;

	@Length(min = 1, max = 12)
	private String valor;

	private Moeda moeda;

	private Date dataHora;

	@Length(max = 1024)
	private String descricao;

	private Idioma idioma;

	@Length(min = 1, max = 9)
	private Integer taxaEmbarque;

	@Length(max = 13)
	private String softDescriptor;

	public DadosPedido() {
		// TODO Auto-generated constructor stub
	}

	public DadosPedido(String numeroPedido, String valor, Moeda moeda, Date dataHora, String descricao, Idioma idioma,
			Integer taxaEmbarque, String softDescriptor) {
		this.numeroPedido = numeroPedido;
		this.valor = valor.replace(".", "").replace(",", "");
		this.moeda = moeda;
		this.dataHora = dataHora;
		this.descricao = descricao;
		this.idioma = idioma;
		this.taxaEmbarque = taxaEmbarque;
		this.softDescriptor = softDescriptor;
	}

	@XmlElement(name = "numero")
	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	@XmlElement(name = "valor")
	public void setValor(String valor) {
		this.valor = valor.replace(".", "").replace(",", "");
	}

	@XmlElement(name = "moeda")
	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}

	@XmlElement(name = "data-hora")
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	@XmlElement(name = "descricao")
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@XmlElement(name = "idioma")
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	@XmlElement(name = "taxa-embarque")
	public void setTaxaEmbarque(Integer taxaEmbarque) {
		this.taxaEmbarque = taxaEmbarque;
	}

	@XmlElement(name = "soft-descriptor")
	public void setSoftDescriptor(String softDescriptor) {
		this.softDescriptor = softDescriptor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public String getValor() {
		return valor;
	}

	public Moeda getMoeda() {
		return moeda;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public String getDescricao() {
		return descricao;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public Integer getTaxaEmbarque() {
		return taxaEmbarque;
	}

	public String getSoftDescriptor() {
		return softDescriptor;
	}
}
