package com.trade.app.client.integration.dto.mapper;

import com.trade.app.client.integration.dto.ShareHolding;
import com.trade.app.client.integration.dto.UpstockShareHolding;

public class UpstockHoldingsMapper implements ShareHoldingMapper<UpstockShareHolding> {

	@Override
	public ShareHolding map(UpstockShareHolding holdingObj) {
		// TODO Auto-generated method stub
		
		 return new ShareHolding(
                holdingObj.isin(),
                holdingObj.cnc_used_quantity(),
                holdingObj.collateral_type(),
                holdingObj.company_name(),
                holdingObj.haircut(),
                holdingObj.product(),
                holdingObj.quantity(),
                holdingObj.trading_symbol(),      // tradingsymbol
                holdingObj.last_price(),
                holdingObj.close_price(),
                holdingObj.pnl(),
                holdingObj.day_change(),
                holdingObj.day_change_percentage(),
                holdingObj.instrument_token(),
                holdingObj.average_price(),
                holdingObj.collateral_quantity(),
                holdingObj.collateral_update_quantity(),
                holdingObj.trading_symbol(),      // tradingSymbol
                holdingObj.t1_quantity(),
                holdingObj.exchange()
        );
	}
}
