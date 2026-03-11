package com.trade.app.client.integration.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.trade.app.client.integration.service.ClientFactoryService;

@Service
public class TradeClientFactory {
	static Map<String, ClientFactoryService> clientMap = new HashMap<>();

	public static void registorClientFactory(String code, ClientFactoryService service) {
		clientMap.put(code, service);
	}

	public static ClientFactoryService getFactoryService(String code) {
		return clientMap.get(code);
	}

}
