package com.trade.app.client.integration.dto.mapper;

import com.trade.app.client.integration.dto.ShareHolding;

public interface ShareHoldingMapper<T> {
	ShareHolding map(T t);
}
