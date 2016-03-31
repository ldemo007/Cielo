package com.softwarecwb.cielo.response.model.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.softwarecwb.cielo.request.model.entity.DadosPedido;
import com.softwarecwb.cielo.request.model.entity.FormaPagamento;
import com.softwarecwb.cielo.response.action.RespostaTransacao;
import com.softwarecwb.cielo.response.model.enumerator.StatusTransacao;

@XmlRootElement(name = "transacao", namespace="http://ecommerce.cbmp.com.br")
public class Transacao extends RespostaTransacao {

	private String versao;

	private String id;

	private String tid;

	private String pan;

	private DadosPedido dadosPedido;

	private FormaPagamento formaPagamento;

	private StatusTransacao status;

	private Autenticacao autenticacao;

	private Autorizacao autorizacao;
	
	// SETTERS

	@XmlElement(name = "tid")
	public void setTid(String tid) {
		this.tid = tid;
	}

	@XmlElement(name = "pan")
	public void setPan(String pan) {
		this.pan = pan;
	}

	@XmlElement(name = "dados-pedido")
	public void setDadosPedido(DadosPedido dadosPedido) {
		this.dadosPedido = dadosPedido;
	}

	@XmlElement(name = "forma-pagamento")
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	@XmlElement(name = "status")
	public void setStatus(StatusTransacao status) {
		this.status = status;
	}

	@XmlElement(name = "autenticacao")
	public void setAutenticacao(Autenticacao autenticacao) {
		this.autenticacao = autenticacao;
	}

	@XmlElement(name = "autorizacao")
	public void setAutorizacao(Autorizacao autorizacao) {
		this.autorizacao = autorizacao;
	}

	@XmlAttribute(name = "id")
	public void setId(String id) {
		this.id = id;
	}

	@XmlAttribute(name = "versao")
	public void setVersao(String versao) {
		this.versao = versao;
	}

	// GETTERS

	public String getTid() {
		return tid;
	}

	public DadosPedido getDadosPedido() {
		return dadosPedido;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public StatusTransacao getStatus() {
		return status;
	}

	public Autenticacao getAutenticacao() {
		return autenticacao;
	}

	public Autorizacao getAutorizacao() {
		return autorizacao;
	}

	public String getId() {
		return id;
	}

	public String getPan() {
		return pan;
	}

	public String getVersao() {
		return versao;
	}
}
