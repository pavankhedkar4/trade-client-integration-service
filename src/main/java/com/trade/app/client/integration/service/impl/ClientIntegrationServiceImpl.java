package com.trade.app.client.integration.service.impl;

import org.springframework.stereotype.Service;

import com.trade.app.client.integration.service.ClientIntegrationService;

@Service
public class ClientIntegrationServiceImpl implements ClientIntegrationService{

	static final String defaultUrlType="client-validation";

	@Override
	public String getTradeClientUrl(String urlType, String clientCode) {
		// TODO Auto-generated method stub
		urlType= urlType.isBlank() ? defaultUrlType : urlType;
		return TradeClientFactory.getFactoryService(clientCode).getUrlByType(urlType);
	}

}
