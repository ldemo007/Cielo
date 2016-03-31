package com.softwarecwb.cielo.service;

import org.springframework.stereotype.Service;

import com.softwarecwb.cielo.request.model.entity.RequisicaoCancelamento;
import com.softwarecwb.cielo.request.model.entity.RequisicaoConsulta;
import com.softwarecwb.cielo.request.model.entity.RequisicaoTransacao;

@Service
public class CieloService implements IService {

	@Override
	public String CriarRequisicaoTransacao(RequisicaoTransacao criarTransacao) {	
		String mensagem = criarTransacao.CriarMensagemRequisicao();
		return criarTransacao.enviarPara(mensagem);
	}

	@Override
	public String CapturarRequisicaoTransacao(RequisicaoConsulta capturaTransacao) {
		String mensagem = capturaTransacao.CriarMensagemRequisicao();
		return capturaTransacao.enviarPara(mensagem);
	}

	@Override
	public String CancelarRequisicaoTransacao(RequisicaoCancelamento cancelarTransacao) {
		String mensagem = cancelarTransacao.CriarMensagemRequisicao();
		return cancelarTransacao.enviarPara(mensagem);
	}

}
