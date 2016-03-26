package com.softwarecwb.cielo.service;

import com.softwarecwb.cielo.request.*;
import com.softwarecwb.cielo.response.RespostaTransacao;

public interface ICieloService {

	RespostaTransacao CriarRequisicaoTransacao(CriarRequisicaoTransacao criarTransacao, boolean debug);
	
	RespostaTransacao VerificaRequisicaoTransacao(CapturarRequisicaoTransacao capturaTransacao,boolean debug);
	
	RespostaTransacao CancelarRequisicaoTransacao(CancelarRequisicaoTransacao cancelarTransacao ,boolean debug);
}
