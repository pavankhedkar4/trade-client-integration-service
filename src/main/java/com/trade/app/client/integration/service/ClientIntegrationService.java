package com.trade.app.client.integration.service;

import com.trade.app.client.integration.dto.UpstockAuthTokenResponse;

public interface ClientIntegrationService {
	public String getTradeClientUrl(String urlType, String clientCode);
	public UpstockAuthTokenResponse getClientAuthToken(String clientCode, String code);
}
