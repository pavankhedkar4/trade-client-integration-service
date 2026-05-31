package com.trade.app.client.integration.service;

import java.util.List;

import com.trade.app.client.integration.dto.ShareHolding;
import com.trade.app.client.integration.dto.TradeHoldingsResponse;
import com.trade.app.client.integration.dto.UpstockAuthTokenResponse;

public interface ClientIntegrationService {
	public String getTradeClientUrl(String urlType, String clientCode);
	public UpstockAuthTokenResponse getClientAuthToken(String clientCode, String code);
	public List<ShareHolding> getTradeHoldings(String clientCode);
}
