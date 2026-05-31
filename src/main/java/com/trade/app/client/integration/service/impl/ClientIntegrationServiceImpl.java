package com.trade.app.client.integration.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trade.app.client.integration.dto.ShareHolding;
import com.trade.app.client.integration.dto.TradeHoldingsResponse;
import com.trade.app.client.integration.dto.UpstockAuthTokenResponse;
import com.trade.app.client.integration.dto.UpstockShareHolding;
import com.trade.app.client.integration.dto.mapper.UpstockHoldingsMapper;
import com.trade.app.client.integration.service.ClientIntegrationService;

@Service
public class ClientIntegrationServiceImpl implements ClientIntegrationService {

	static final String defaultUrlType = "client-validation";

	@Override
	public String getTradeClientUrl(String urlType, String clientCode) {
		// TODO Auto-generated method stub
		urlType = urlType.isBlank() ? defaultUrlType : urlType;
		return TradeClientFactory.getFactoryService(clientCode).getUrlByType(urlType);
	}

	@Override
	public UpstockAuthTokenResponse getClientAuthToken(String clientCode, String code) {
		// TODO Auto-generated method stub
		String response = TradeClientFactory.getFactoryService(clientCode).getAuthToken(code);
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		UpstockAuthTokenResponse upstockAuthTokenResponse = null;
		try {
			upstockAuthTokenResponse = objectMapper.readValue(response, UpstockAuthTokenResponse.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return upstockAuthTokenResponse;
	}

	@Override
	public List<ShareHolding> getTradeHoldings(String clientCode) {
		// TODO Auto-generated method stub
		String response = TradeClientFactory.getFactoryService(clientCode).getTradeHoldings();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		TradeHoldingsResponse upstockAuthTokenResponse = null;
		UpstockHoldingsMapper mapper = new UpstockHoldingsMapper();
		List<ShareHolding> shareHoldings = null;
		try {
			upstockAuthTokenResponse = objectMapper.readValue(response, TradeHoldingsResponse.class);
			shareHoldings = upstockAuthTokenResponse.data().stream()
					.map(obj -> objectMapper.convertValue(obj, UpstockShareHolding.class)).map(mapper::map).toList();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shareHoldings;
	}

}
