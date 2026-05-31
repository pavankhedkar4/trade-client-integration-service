package com.trade.app.client.integration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trade.app.client.integration.dto.ShareHolding;
import com.trade.app.client.integration.dto.TradeHoldingsResponse;
import com.trade.app.client.integration.dto.UpstockAuthTokenResponse;
import com.trade.app.client.integration.service.ClientIntegrationService;
import com.trade.app.upstock.lib.service.UpstockUrlBuilder;

@RequestMapping("/api/client")
@RestController
public class ClientIntegrationController {

	@Autowired
	ClientIntegrationService clientIntegrationService;

	@GetMapping("/validate")
	public ResponseEntity<String> getValidationUrl(@RequestParam String clientCode) {
		String url = clientIntegrationService.getTradeClientUrl("", clientCode);
		return new ResponseEntity<String>(url, HttpStatus.OK);
	}
	
	@PostMapping("/get-token")
	public ResponseEntity<UpstockAuthTokenResponse> getClientAuthToken(@RequestParam String clientCode, @RequestParam String code){
		UpstockAuthTokenResponse res= clientIntegrationService.getClientAuthToken(clientCode, code);
		return new ResponseEntity<UpstockAuthTokenResponse>(res, HttpStatus.OK);
	}
	
	@GetMapping("/holdings")
	public ResponseEntity<List<ShareHolding>> getStockHoldings(@RequestParam String clientCode) {
		List<ShareHolding> holdings = clientIntegrationService.getTradeHoldings(clientCode);
		return new ResponseEntity<List<ShareHolding>>(holdings, HttpStatus.OK);
	}

}
