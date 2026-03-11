package com.trade.app.client.integration.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public interface ClientFactoryService {
	
	void registerClient();

	public String getUrlByType(String type);

}


