package com.softwarecwb.cielo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.softwarecwb.cielo.request.CancelarRequisicaoTransacao;
import com.softwarecwb.cielo.request.CapturarRequisicaoTransacao;
import com.softwarecwb.cielo.request.CriarRequisicaoTransacao;
import com.softwarecwb.cielo.response.RespostaTransacao;

@Service
public class CieloService implements ICieloService {

	@Override
	public RespostaTransacao CriarRequisicaoTransacao(CriarRequisicaoTransacao criarTransacao, boolean debug) {
		return criarTransacao.enviarParaCielo(debug);
	}

	@Override
	public RespostaTransacao VerificaRequisicaoTransacao(CapturarRequisicaoTransacao capturaTransacao, boolean debug) {
		return capturaTransacao.enviarParaCielo(debug);
	}

	@Override
	public RespostaTransacao CancelarRequisicaoTransacao(CancelarRequisicaoTransacao cancelarTransacao, boolean debug) {
		return cancelarTransacao.enviarParaCielo(debug);
	}

}
