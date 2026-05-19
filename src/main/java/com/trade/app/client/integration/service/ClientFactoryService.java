package com.trade.app.client.integration.service;
import org.springframework.stereotype.Service;

@Service
public interface ClientFactoryService {

	public String getUrlByType(String type);
	public String getAuthToken(String code);

}


