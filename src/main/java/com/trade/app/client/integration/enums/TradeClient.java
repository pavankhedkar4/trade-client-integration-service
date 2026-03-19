package com.trade.app.client.integration.enums;

public enum TradeClient {
    UPSTOCK("upstock");

    private final String code;

    TradeClient(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static TradeClient getValueByCode(String code) {
        for (TradeClient c : TradeClient.values()) {
            if (c.code.equalsIgnoreCase(code)) {
                return c;
            }
        }
        throw new IllegalArgumentException("Invalid TradeClient code: " + code);
    }
}