package main.java.com.backend.challengeconversormonedas.config;

import main.java.com.backend.challengeconversormonedas.exception.failLoadConfigurationException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static final String CONFIG_FILE = "src/main/resources/application.properties";
    private static Properties properties = new Properties();

    static {
        try (FileInputStream input = new FileInputStream(CONFIG_FILE)) {
            properties.load(input);
            replaceEnvVariables();
        } catch (IOException e) {
            throw new failLoadConfigurationException("Error al cargar el archivo de configuración: " + e.getMessage());
        }
    }

    private static void replaceEnvVariables() {
        for (String key : properties.stringPropertyNames()) {
            String value = properties.getProperty(key);
            if (value != null && value.startsWith("${") && value.endsWith("}")) {
                String envVar = value.substring(2, value.length() - 1);
                String envValue = System.getenv(envVar);
                if (envValue != null) {
                    properties.setProperty(key, envValue);
                }
            }
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
