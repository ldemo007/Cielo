package com.softwarecwb.cielo.request.model.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.Length;

import com.softwarecwb.cielo.request.action.Requisicao;
import com.softwarecwb.cielo.request.model.enumerador.Autorizar;

@XmlRootElement(name = "requisicao-transacao")
@XmlType(propOrder = { "dadosEc", "dadosPortador", "dadosPedido", "formaPagamento", "urlRetorno", "autorizar",
		"capturar", "campoLivre", "bin", "gerarToken" })
public class RequisicaoTransacao extends Requisicao {

	private DadosEC dadosEc;

	private DadosPortador dadosPortador;

	private DadosPedido dadosPedido;

	private FormaPagamento formaPagamento;

	@Length(max = 1024)
	private String urlRetorno;

	private Autorizar autorizar;

	private boolean capturar;

	private String campoLivre;

	private String bin;

	private boolean gerarToken;

	public RequisicaoTransacao() {
		// TODO Auto-generated constructor stub
	}

	public RequisicaoTransacao(DadosPortador dadosPortador, DadosPedido dadosPedido, FormaPagamento formaPagamento,
			String urlRetorno, Autorizar autorizar, boolean capturar, String campoLivre, String bin,
			boolean gerarToken) {
		super();
		this.dadosPortador = dadosPortador;
		this.dadosPedido = dadosPedido;
		this.formaPagamento = formaPagamento;
		this.urlRetorno = urlRetorno;
		this.autorizar = autorizar;
		this.capturar = capturar;
		this.campoLivre = campoLivre;
		this.bin = bin;
		this.gerarToken = gerarToken;
	}

	@XmlElement(name = "dados-ec")
	public void setDadosEc(DadosEC dadosEc) {
		this.dadosEc = dadosEc;
	}

	@XmlElement(name = "dados-portador")
	public void setDadosPortador(DadosPortador dadosPortador) {
		this.dadosPortador = dadosPortador;
	}

	@XmlElement(name = "dados-pedido")
	public void setDadosPedido(DadosPedido dadosPedido) {
		this.dadosPedido = dadosPedido;
	}

	@XmlElement(name = "forma-pagamento")
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	@XmlElement(name = "url-retorno")
	public void setUrlRetorno(String urlRetorno) {
		this.urlRetorno = urlRetorno;
	}

	@XmlElement(name = "autorizar")
	public void setAutorizar(Autorizar autorizar) {
		this.autorizar = autorizar;
	}

	@XmlElement(name = "capturar")
	public void setCapturar(boolean capturar) {
		this.capturar = capturar;
	}

	@XmlElement(name = "campo-livre")
	public void setCampoLivre(String campoLivre) {
		this.campoLivre = campoLivre;
	}

	@XmlElement(name = "bin")
	public void setBin(String bin) {
		this.bin = bin;
	}

	@XmlElement(name = "gerar-token")
	public void setGerarToken(boolean gerarToken) {
		this.gerarToken = gerarToken;
	}

	public DadosEC getDadosEc() {
		return dadosEc;
	}

	public DadosPortador getDadosPortador() {
		return dadosPortador;
	}

	public DadosPedido getDadosPedido() {
		return dadosPedido;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public String getUrlRetorno() {
		return urlRetorno;
	}

	public Autorizar getAutorizar() {
		return autorizar;
	}

	public boolean isCapturar() {
		return capturar;
	}

	public String getCampoLivre() {
		return campoLivre;
	}

	public String getBin() {
		return bin;
	}

	public boolean isGerarToken() {
		return gerarToken;
	}

}
