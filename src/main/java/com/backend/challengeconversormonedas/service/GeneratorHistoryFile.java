package main.java.com.backend.challengeconversormonedas.service;

import main.java.com.backend.challengeconversormonedas.entity.ExchangeRate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GeneratorHistoryFile {

    private static final String FILE_PATH = "src/main/java/com/backend/challengeconversormonedas/storage/ConversionsHistory.json";

    public static void saveJson(ExchangeRate exchangeRate) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        List<ExchangeRate> history = readJson();
        history.add(exchangeRate);

        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(history, writer);
        }
    }

    private static List<ExchangeRate> readJson() throws IOException {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<ExchangeRate>>() {
        }.getType();

        if (!Files.exists(Paths.get(FILE_PATH))) {
            return new ArrayList<>();
        }

        try (FileReader reader = new FileReader(FILE_PATH)) {
            return gson.fromJson(reader, listType);
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
