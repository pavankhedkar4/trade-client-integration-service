package com.trade.app.client.integration.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.app.client.integration.config.annotations.RegisterClient;
import com.trade.app.client.integration.enums.TradeClient;
import com.trade.app.client.integration.service.ClientFactoryService;

@Service
public class TradeClientFactory {
	static Map<TradeClient, ClientFactoryService> clientMap = new HashMap<>();

	/*
	 * public static void registorClientFactory(String code, ClientFactoryService
	 * service) { clientMap.put(code, service); }
	 */
	@Autowired
	public TradeClientFactory(List<ClientFactoryService> services) {
		for(ClientFactoryService service: services) {
			RegisterClient client= service.getClass().getAnnotation(RegisterClient.class);
			if(client == null) {
				throw new RuntimeException("Please register a client");
			}
			TradeClient clientCode= client.value();
			clientMap.put(clientCode, service);
		}
		
	}

	public static ClientFactoryService getFactoryService(String code) {
		return clientMap.get(TradeClient.getValueByCode(code));
	}

}
