package com.backend.challengeconversormonedas.config;

import com.backend.challengeconversormonedas.exception.failLoadConfigurationException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static final String CONFIG_FILE = "src/java/resources/application.properties";
    private static Properties properties = new Properties();

    static {
        try (FileInputStream input = new FileInputStream(CONFIG_FILE)) {
            properties.load(input);
        } catch (IOException e) {
            throw new failLoadConfigurationException("Error al cargar el archivo de configuración: " + e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
