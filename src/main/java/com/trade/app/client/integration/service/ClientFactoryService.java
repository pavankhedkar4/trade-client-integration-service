package com.trade.app.client.integration.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.app.client.integration.service.impl.TradeClientFactory;


@Service
public interface ClientFactoryService {

	public String getUrlByType(String type);

}


