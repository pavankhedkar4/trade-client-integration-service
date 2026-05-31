package com.trade.app.client.integration.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record UpstockShareHolding(String isin, int cnc_used_quantity, String collateral_type, String company_name,
		double haircut, String product, int quantity, double last_price, double close_price,
		double pnl, double day_change, double day_change_percentage, String instrument_token, double average_price,
		int collateral_quantity, int collateral_update_quantity, String trading_symbol, int t1_quantity,
		String exchange) {
	
}