package com.trade.app.client.integration.service;

import org.springframework.stereotype.Service;

@Service
public interface ClientFactoryService {

	String getUrlByType(String type);

	String getAuthToken(String code);

	String getTradeHoldings();

}
