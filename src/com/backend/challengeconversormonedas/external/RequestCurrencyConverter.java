package com.backend.challengeconversormonedas.external;

import com.backend.challengeconversormonedas.config.ConfigLoader;
import com.backend.challengeconversormonedas.exception.FailRequestException;
import com.backend.challengeconversormonedas.entity.ExchangeRateEX;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestCurrencyConverter {
    String apiKey = ConfigLoader.getProperty("java.security.apikey");

    public ExchangeRateEX requestConverter(String baseCurrency, String targetCurrency, double amount) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + baseCurrency + "/" + targetCurrency + "/" + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();

            return gson.fromJson(json, ExchangeRateEX.class);

        } catch (Exception e) {
            throw new FailRequestException(" Failure API request." + e.getMessage());
        }
    }

}
