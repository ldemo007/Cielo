package com.softwarecwb.cielo.response.model.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.softwarecwb.cielo.response.action.RespostaTransacao;

@XmlRootElement(name = "retorno-token", namespace = "http://ecommerce.cbmp.com.br")
public class RetornoToken extends RespostaTransacao {

	private Token token;

	@XmlElement(name = "token")
	public void setToken(Token token) {
		this.token = token;
	}

	public Token getToken() {
		return token;
	}

}
