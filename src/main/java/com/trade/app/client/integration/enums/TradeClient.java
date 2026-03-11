package com.trade.app.client.integration.enums;

public enum TradeClient {
	UPSTOCK("upstock");

	TradeClient(String code) {
		// TODO Auto-generated constructor stub
	}
	
	public TradeClient getByCode(String code) {
		
		return TradeClient.valueOf(code);
	}
	
}
