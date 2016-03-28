package com.softwarecwb.cielo.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.Length;

import com.softwarecwb.cielo.request.model.DadosEC;

@XmlRootElement(name = "requisicao-captura")
@XmlType(propOrder = { "tid", "dadosEC", "valor" })
public class CapturarRequisicaoTransacao extends RequisicaoTransacao{
	
	private String tid;

	private DadosEC dadosEC;

	@Length(min = 1, max = 12)
	private Double valor;

	// GETTERS
	@XmlElement(name = "valor")
	public String getValor() {
		String v = String.valueOf(valor);
		return v.replace(".", "");
	}

	@XmlElement(name = "dados-ec")
	public DadosEC getDadosEC() {
		return dadosEC;
	}

	@XmlElement(name = "tid")
	public String getTid() {
		return tid;
	}

	// SETTERS
	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public void setDadosEC(DadosEC dadosEC) {
		this.dadosEC = dadosEC;
	}
}
