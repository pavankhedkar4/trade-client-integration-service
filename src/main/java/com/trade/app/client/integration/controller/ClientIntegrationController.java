package com.trade.app.client.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trade.app.client.integration.service.ClientIntegrationService;
import com.trade.app.upstock.lib.service.UpstockUrlBuilder;

@RequestMapping("/api/client")
@RestController
public class ClientIntegrationController {

	@Autowired
	ClientIntegrationService clientIntegrationService;
	
	@Autowired
	UpstockUrlBuilder builder;

	@GetMapping("/validate")
	public ResponseEntity<String> getValidationUrl(@RequestParam String clientCode) {
		String url = clientIntegrationService.getTradeClientUrl("", clientCode);
		return new ResponseEntity<String>(url, HttpStatus.OK);
	}
	

}
