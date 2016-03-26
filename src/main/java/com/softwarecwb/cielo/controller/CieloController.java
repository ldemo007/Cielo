package com.softwarecwb.cielo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.softwarecwb.cielo.request.CriarRequisicaoTransacao;
import com.softwarecwb.cielo.request.RequisicaoTransacao;
import com.softwarecwb.cielo.response.RespostaTransacao;
import com.softwarecwb.cielo.service.CieloService;

@RestController
@RequestMapping("cielo")
public class CieloController {

	@Autowired
	CieloService service;
	
	
	@RequestMapping(value = "/transacao/", method = RequestMethod.POST)
	public RespostaTransacao CriarTransacao(@ModelAttribute("CriarTransacao")CriarRequisicaoTransacao criarRequisicaoTransacao) {
		return service.CriarRequisicaoTransacao(criarRequisicaoTransacao,false);
	}
	
	@RequestMapping(value = "/transacao/debug/", method = RequestMethod.POST)
	public RespostaTransacao CriarTransacaoTeste(@ModelAttribute("CriarTransacao")CriarRequisicaoTransacao criarRequisicaoTransacao) {
		return service.CriarRequisicaoTransacao(criarRequisicaoTransacao,true);
	}
}
