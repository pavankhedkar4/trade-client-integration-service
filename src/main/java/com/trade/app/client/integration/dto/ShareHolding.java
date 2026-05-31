package com.trade.app.client.integration.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record ShareHolding(String intSecuritiesIdentificationNum, int cncUsedQuantity, String collateralType,
		String companyName, double haircut, String product, int quantity, String tradingsymbol, double lastPrice,
		double closePrice, double profitAndLoss, double dayChange, double dayChangePercentage, String instrumentToken,
		double averagePrice, int collateralQuantity, int collateralUpdateQuantity, String tradingSymbol, int t1Quantity,
		String exchange) {

}