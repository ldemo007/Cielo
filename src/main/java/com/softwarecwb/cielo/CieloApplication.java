package com.softwarecwb.cielo;

import java.util.Date;

import com.softwarecwb.cielo.request.CancelarRequisicaoTransacao;
import com.softwarecwb.cielo.request.CapturarRequisicaoTransacao;
import com.softwarecwb.cielo.request.CriarRequisicaoTransacao;
import com.softwarecwb.cielo.request.model.DadosEC;
import com.softwarecwb.cielo.request.model.DadosPedido;
import com.softwarecwb.cielo.request.model.DadosPortador;
import com.softwarecwb.cielo.request.model.FormaPagamento;
import com.softwarecwb.cielo.request.model.enumerador.Autorizar;
import com.softwarecwb.cielo.request.model.enumerador.Bandeira;
import com.softwarecwb.cielo.request.model.enumerador.CodigoProduto;
import com.softwarecwb.cielo.request.model.enumerador.Indicador;

public class CieloApplication {

	public static void main(String[] args) {
		CriarRequisicaoTransacao();
		//CapturarRequisicaoTransacao("10069930690005ED1FCA");
		//CancelcarRequisicaoTransacao("10069930690005ED1FCA");
	}

	private static void CancelcarRequisicaoTransacao(String tid) {
		CancelarRequisicaoTransacao cancelarRequisicaoTransacao = new CancelarRequisicaoTransacao();
		cancelarRequisicaoTransacao.setTid(tid);
		cancelarRequisicaoTransacao.setDadosEC(new DadosEC("1006993069", "25fbb99741c739dd84d7b06ec78c9bac718838630f30b112d033ce2e621b34f3"));
		cancelarRequisicaoTransacao.setValor(new Double(10.00));
		
		System.out.println(cancelarRequisicaoTransacao.enviarParaCielo(true));
		
	}

	private static void CapturarRequisicaoTransacao(String tid) {
		CapturarRequisicaoTransacao capturarRequisicaoTransacao = new CapturarRequisicaoTransacao();
		capturarRequisicaoTransacao.setTid(tid);
		capturarRequisicaoTransacao.setDadosEC(new DadosEC("1006993069", "25fbb99741c739dd84d7b06ec78c9bac718838630f30b112d033ce2e621b34f3"));
		capturarRequisicaoTransacao.setValor(new Double(10.00));
		
		System.out.println(capturarRequisicaoTransacao.enviarParaCielo(true));
	}

	private static String CriarRequisicaoTransacao() {
		CriarRequisicaoTransacao requisicaoTransacao = new CriarRequisicaoTransacao();

		requisicaoTransacao.setDadosEc(
				new DadosEC("1006993069", "25fbb99741c739dd84d7b06ec78c9bac718838630f30b112d033ce2e621b34f3"));
		requisicaoTransacao.setDadosPortador(new DadosPortador("4012001038443335", "201610", Indicador.INFORMADO, "973",
				null, null));
		requisicaoTransacao.setDadosPedido(new DadosPedido("12553", new Double(10.00), null, new Date(), null, null, null, "BNE"));
		requisicaoTransacao.setFormaPagamento(new FormaPagamento(Bandeira.visa, CodigoProduto.CODIGO_A_VISTA, 1));
		requisicaoTransacao.setAutorizar(Autorizar.AUTORIZAR_SEM_PASSAR_POR_AUTENTICACAO);
		requisicaoTransacao.setCapturar(false);

		System.out.println(requisicaoTransacao.enviarParaCielo(true));
		return null;

	}

}
