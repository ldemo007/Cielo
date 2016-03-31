package com.softwarecwb.cielo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softwarecwb.cielo.service.CieloService;

@RestController
@RequestMapping("cielo")
public class CieloController {

	@Autowired
	CieloService service;
}
