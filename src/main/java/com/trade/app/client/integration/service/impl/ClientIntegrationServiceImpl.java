package com.trade.app.client.integration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.app.client.integration.service.ClientIntegrationService;

@Service
public class ClientIntegrationServiceImpl implements ClientIntegrationService{

	
	@Autowired
	TradeClientFactory factory;
	
	@Override
	public String getTradeClientUrl(String urlType, String clientCode) {
		// TODO Auto-generated method stub
		return factory.getFactoryService(clientCode).getUrlByType(urlType);
	}

}
