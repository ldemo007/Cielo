package com.softwarecwb.cielo.service;

import com.softwarecwb.cielo.request.model.entity.RequisicaoCancelamento;
import com.softwarecwb.cielo.request.model.entity.RequisicaoConsulta;
import com.softwarecwb.cielo.request.model.entity.RequisicaoTransacao;

public interface IService {

	String CriarRequisicaoTransacao(RequisicaoTransacao criarTransacao);
	
	String CapturarRequisicaoTransacao(RequisicaoConsulta capturaTransacao);
	
	String CancelarRequisicaoTransacao(RequisicaoCancelamento cancelarTransacao);
}
