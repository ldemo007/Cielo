package com.softwarecwb.cielo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.softwarecwb.cielo.request.CancelarRequisicaoTransacao;
import com.softwarecwb.cielo.request.CapturarRequisicaoTransacao;
import com.softwarecwb.cielo.request.CriarRequisicaoTransacao;
import com.softwarecwb.cielo.response.RespostaTransacao;
import com.softwarecwb.cielo.service.CieloService;

@RestController
@RequestMapping("cielo")
public class CieloController {

	@Autowired
	CieloService service;

	@RequestMapping(value = "/transacao/criar/", method = RequestMethod.POST)
	public RespostaTransacao CriarTransacao(
			@ModelAttribute("CriarTransacao") CriarRequisicaoTransacao criarRequisicaoTransacao) {
		return service.CriarRequisicaoTransacao(criarRequisicaoTransacao, false);
	}

	@RequestMapping(value = "/transacao/criar/debug/", method = RequestMethod.POST)
	public RespostaTransacao CriarTransacaoTeste(
			@ModelAttribute("CriarTransacao") CriarRequisicaoTransacao criarRequisicaoTransacao) {
		return service.CriarRequisicaoTransacao(criarRequisicaoTransacao, true);
	}

	@RequestMapping(value = "/transacao/capturar/{tid}", method = RequestMethod.GET)
	public RespostaTransacao CapturarTransacao(
			@ModelAttribute("CapturarTransacao") CapturarRequisicaoTransacao capturarRequisicaoTransacao) {
		return service.CapturarRequisicaoTransacao(capturarRequisicaoTransacao, false);
	}

	@RequestMapping(value = "/transacao/capturar/{tid}", method = RequestMethod.GET)
	public RespostaTransacao CapturarTransacaoTeste(
			@ModelAttribute("CapturarTransacao") CapturarRequisicaoTransacao capturarRequisicaoTransacao) {
		return service.CapturarRequisicaoTransacao(capturarRequisicaoTransacao, true);
	}

	@RequestMapping(value = "/transacao/cancelar/", method = RequestMethod.POST)
	public RespostaTransacao CancelarTransacao(
			@ModelAttribute("CancelarTransacao") CancelarRequisicaoTransacao cancelarTransacao) {
		return service.CancelarRequisicaoTransacao(cancelarTransacao, false);
	}

	@RequestMapping(value = "/transacao/cancelar/debug/", method = RequestMethod.POST)
	public RespostaTransacao CancelarTransacaoTeste(
			@ModelAttribute("CancelarTransacao") CancelarRequisicaoTransacao cancelarTransacao) {
		return service.CancelarRequisicaoTransacao(cancelarTransacao, true);
	}
}
