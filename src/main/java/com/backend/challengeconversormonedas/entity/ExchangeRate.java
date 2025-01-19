package main.java.com.backend.challengeconversormonedas.entity;

import java.util.Date;

public class ExchangeRate {
    private String result;
    private String baseCode;
    private String targetCode;
    private double conversionRate;
    private double conversionResult;
    private String timeLastUpdateUtc;
    private double amountToConver;
    private Date creationDate;

    public ExchangeRate() {
    }


    public ExchangeRate(ExchangeRateEX exchangeRateEX, double amountToConver) {
        this.result = exchangeRateEX.result();
        this.baseCode = exchangeRateEX.baseCode();
        this.targetCode = exchangeRateEX.targetCode();
        this.conversionRate = exchangeRateEX.conversionRate();
        this.conversionResult = exchangeRateEX.conversionResult();
        this.timeLastUpdateUtc = exchangeRateEX.timeLastUpdateUtc();
        this.amountToConver = amountToConver;
        this.creationDate = new Date();
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public double getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(double conversionResult) {
        this.conversionResult = conversionResult;
    }

    public String getTimeLastUpdateUtc() {
        return timeLastUpdateUtc;
    }

    public void setTimeLastUpdateUtc(String timeLastUpdateUtc) {
        this.timeLastUpdateUtc = timeLastUpdateUtc;
    }

    @Override
    public String toString() {
        return "\n"+creationDate + " =>> El valor de " + amountToConver + " [" + baseCode + "] " +
                "corresponde al valor final de =>>> " +
                conversionResult + " [" + targetCode + "]\n";
    }
}
