package com.softwarecwb.cielo;

import java.util.Date;

import com.softwarecwb.cielo.request.model.entity.DadosEC;
import com.softwarecwb.cielo.request.model.entity.DadosPedido;
import com.softwarecwb.cielo.request.model.entity.DadosPortador;
import com.softwarecwb.cielo.request.model.entity.FormaPagamento;
import com.softwarecwb.cielo.request.model.entity.RequisicaoCancelamento;
import com.softwarecwb.cielo.request.model.entity.RequisicaoConsulta;
import com.softwarecwb.cielo.request.model.entity.RequisicaoTransacao;
import com.softwarecwb.cielo.request.model.enumerador.Autorizar;
import com.softwarecwb.cielo.request.model.enumerador.Bandeira;
import com.softwarecwb.cielo.request.model.enumerador.CodigoProduto;
import com.softwarecwb.cielo.request.model.enumerador.Idioma;
import com.softwarecwb.cielo.request.model.enumerador.Indicador;
import com.softwarecwb.cielo.request.model.enumerador.Moeda;

public class CieloApplication {

	public static void main(String[] args) {
		CriarRequisicaoTransacao();
		CapturarRequisicaoTransacao("10069930690005ED1FCA");
		CancelcarRequisicaoTransacao("10069930690005ED1FCA");
	}

	private static void CancelcarRequisicaoTransacao(String tid) {
		RequisicaoCancelamento cancelarRequisicaoTransacao = new RequisicaoCancelamento();
		cancelarRequisicaoTransacao.setTid(tid);
		cancelarRequisicaoTransacao.setDadosEC(new DadosEC("1006993069", "25fbb99741c739dd84d7b06ec78c9bac718838630f30b112d033ce2e621b34f3"));
		cancelarRequisicaoTransacao.setValor(new Double(10.00));
		
		System.out.println(cancelarRequisicaoTransacao.enviarPara(cancelarRequisicaoTransacao.CriarMensagemRequisicao()));
		
	}

	private static void CapturarRequisicaoTransacao(String tid) {
		RequisicaoConsulta capturarRequisicaoTransacao = new RequisicaoConsulta();
		capturarRequisicaoTransacao.setTid(tid);
		capturarRequisicaoTransacao.setDadosEC(new DadosEC("1006993069", "25fbb99741c739dd84d7b06ec78c9bac718838630f30b112d033ce2e621b34f3"));
		capturarRequisicaoTransacao.setValor(new Double(10.00));
		
		System.out.println(capturarRequisicaoTransacao.enviarPara(capturarRequisicaoTransacao.CriarMensagemRequisicao()));
	}

	private static String CriarRequisicaoTransacao() {
		RequisicaoTransacao requisicaoTransacao = new RequisicaoTransacao();
		requisicaoTransacao.setDadosEc(
				new DadosEC("1006993069", "25fbb99741c739dd84d7b06ec78c9bac718838630f30b112d033ce2e621b34f3"));
		requisicaoTransacao.setDadosPortador(new DadosPortador("4012001038443335", "201610", Indicador.INFORMADO, "973",
				null, null));
		requisicaoTransacao.setDadosPedido(new DadosPedido("12553", "10.00", Moeda.REAL, new Date(), "", Idioma.PT,0 ,"BNE"));
		requisicaoTransacao.setFormaPagamento(new FormaPagamento(Bandeira.visa, CodigoProduto.CODIGO_A_VISTA, 1));
		requisicaoTransacao.setAutorizar(Autorizar.AUTORIZAR_SEM_PASSAR_POR_AUTENTICACAO);
		requisicaoTransacao.setCapturar(false);

		System.out.println(requisicaoTransacao.enviarPara(requisicaoTransacao.CriarMensagemRequisicao()));
		return null;

	}

}
