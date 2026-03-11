package com.trade.app.client.integration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.app.client.integration.enums.TradeClient;
import com.trade.app.client.integration.service.ClientFactoryService;
import com.trade.app.upstock.lib.service.UpstockUrlBuilder;

@Service
public class UpstockFacotyServiceImpl implements ClientFactoryService {

	@Autowired
	TradeClientFactory factory;
	
	@Autowired
	UpstockUrlBuilder upstockUrlBuilder;
	

	@Override
	public String getUrlByType(String type) {
		// TODO Auto-generated method stub
		return upstockUrlBuilder.buildAccessCodeUrl();
	}

	@Override
	public void registerClient() {
		TradeClientFactory.registorClientFactory(TradeClient.UPSTOCK.name(), new UpstockFacotyServiceImpl());
	}

}
