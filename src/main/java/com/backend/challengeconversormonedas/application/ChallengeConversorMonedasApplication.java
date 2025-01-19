package main.java.com.backend.challengeconversormonedas.application;

import main.java.com.backend.challengeconversormonedas.external.RequestCurrencyConverter;
import main.java.com.backend.challengeconversormonedas.entity.ExchangeRate;
import main.java.com.backend.challengeconversormonedas.entity.ExchangeRateEX;
import main.java.com.backend.challengeconversormonedas.service.GeratorConversionHistory;

import java.util.Scanner;

public class ChallengeConversorMonedasApplication {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);
        RequestCurrencyConverter requestCurrency = new RequestCurrencyConverter();
        String baseCurrency = "";
        String targetCurrency = "";
        double amount = 0;

        Integer optionSelect = -1;

        while (optionSelect != 0) {
            printMenu();

            try {
                optionSelect = inputData.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese un numero por favor!\n");
                inputData.nextLine();
                continue;
            }

            switch (optionSelect) {
                case 1 -> {
                    baseCurrency = "USD";
                    targetCurrency = "ARS";
                }
                case 2 -> {
                    baseCurrency = "ARS";
                    targetCurrency = "USD";
                }
                case 3 -> {
                    baseCurrency = "USD";
                    targetCurrency = "BRL";
                }
                case 4 -> {
                    baseCurrency = "BRL";
                    targetCurrency = "USD";
                }
                case 5 -> {
                    baseCurrency = "USD";
                    targetCurrency = "COP";
                }
                case 6 -> {
                    baseCurrency = "COP";
                    targetCurrency = "USD";
                }
                case 7 -> {
                    baseCurrency = "USD";
                    targetCurrency = "PEN";
                }
                case 8 -> {
                    baseCurrency = "PEN";
                    targetCurrency = "USD";
                }
                case 9 -> {
                    System.out.println("Histórico de conversiones por fecha:");
                    System.out.println(GeratorConversionHistory.conversiones + "\n");
                }
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion incorrecta. Intente nuevamente.\n");
            }

            if (optionSelect > 0 && optionSelect < 9) {
                System.out.println("Ingrese el valor que deseas convertir:");
                try {
                    amount = inputData.nextDouble();
                } catch (Exception e) {
                    System.out.println("Intente nuevamente. Ingresando una cantidad valida!\n");
                    inputData.nextLine();
                    continue;
                }
                runProcessing(requestCurrency, baseCurrency, targetCurrency, amount);
            }
        }
        inputData.close();
    }

    private static void printMenu() {
        System.out.println("""
                *****************************************************
                Sea bienbenido/a al Conversor de Monedas =]
                                    
                1) Dolar =>> Peso Argentino
                2) Peso Argentino =>> Dolar
                3) Dolar =>> Real Brasileño
                4) Real Brasileño =>> Dolar
                5) Dolar =>> Peso Colombiano
                6) Peso Colombiano =>> Dolar
                7) Dolar =>> NuevoSol Peruano
                8) NuevoSol Peruano =>> Dolar
                                    
                9) Mostrar historico de conversiones
                0) salir
                =>> Elija una opcion valida
                                    
                *****************************************************
                """);
    }

    private static void runProcessing(RequestCurrencyConverter requestCurrency, String baseCurrency, String
            targetCurrency, double amount) {
        ExchangeRateEX conversionRateEX = requestCurrency.requestConverter(baseCurrency, targetCurrency, amount);
        ExchangeRate conversionRate = GeratorConversionHistory.saveCoversion(conversionRateEX, amount);
        System.out.println("=>> El valor de " + amount + " [" + baseCurrency + "] " + "corresponde al valor final de =>>> " +
                conversionRate.getConversionResult() + " [" + targetCurrency + "]\n");
    }
}
