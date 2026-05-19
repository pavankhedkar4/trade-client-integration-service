package com.trade.app.client.integration.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UpstockAuthTokenResponse(String email, List<String> exchanges, List<String> products, String broker,
		String user_id, String user_name, List<String> order_types, String user_type, boolean is_active, String access_token,
		String extended_token) {

}
