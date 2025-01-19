package com.backend.challengeconversormonedas.entity;

public record ExchangeRateEX(String result,
                             String baseCode,
                             String targetCode,
                             double conversionRate,
                             double conversionResult,
                             String timeLastUpdateUtc) {
}
