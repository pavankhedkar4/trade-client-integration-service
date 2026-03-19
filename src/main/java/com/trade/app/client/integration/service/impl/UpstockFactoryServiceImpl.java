package com.trade.app.client.integration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.app.client.integration.config.annotations.RegisterClient;
import com.trade.app.client.integration.enums.TradeClient;
import com.trade.app.client.integration.service.ClientFactoryService;
import com.trade.app.upstock.lib.service.UpstockUrlBuilder;

@Service
@RegisterClient(TradeClient.UPSTOCK)
public class UpstockFactoryServiceImpl implements ClientFactoryService {
	
	@Autowired
	UpstockUrlBuilder upstockUrlBuilder;
	

	@Override
	public String getUrlByType(String type) {
		// TODO Auto-generated method stub
		return upstockUrlBuilder.buildAccessCodeUrl(type);
	}

	/*
	 * @Override public void registerClient() {
	 * TradeClientFactory.registorClientFactory(TradeClient.UPSTOCK.name(), new
	 * UpstockFacotyServiceImpl()); }
	 */

}
