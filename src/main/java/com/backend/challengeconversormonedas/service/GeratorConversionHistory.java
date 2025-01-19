package main.java.com.backend.challengeconversormonedas.service;

import main.java.com.backend.challengeconversormonedas.exception.FileSaveException;
import main.java.com.backend.challengeconversormonedas.entity.ExchangeRate;
import main.java.com.backend.challengeconversormonedas.entity.ExchangeRateEX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeratorConversionHistory {

    public static List<ExchangeRate> conversiones = new ArrayList<>();

    public static ExchangeRate saveCoversion(ExchangeRateEX conversionRate, double amount) {

        ExchangeRate exchangeRate = new ExchangeRate(conversionRate, amount);

        conversiones.add(exchangeRate);

        try {
            GeneratorHistoryFile.saveJson(exchangeRate);
        } catch (IOException e) {
            throw new FileSaveException("Hubo un error al guardar el archivo" + e.getMessage());
        }
        return exchangeRate;
    }
}
