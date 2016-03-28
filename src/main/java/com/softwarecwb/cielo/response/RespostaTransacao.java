package com.softwarecwb.cielo.response;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public class RespostaTransacao {

	private Transacao transacao;

	private Erro erro;

	private RetornoToken retornoToken;

	public Transacao getTransacao() {
		return transacao;
	}

	public void setTransacao(Transacao transacao) {
		this.transacao = transacao;
	}

	public void setErro(Erro erro) {
		this.erro = erro;
	}

	public Erro getErro() {
		return erro;
	}

	public void setRetornoToken(RetornoToken retornoToken) {
		this.retornoToken = retornoToken;
	}

	public RetornoToken getRetornoToken() {
		return retornoToken;
	}
}
