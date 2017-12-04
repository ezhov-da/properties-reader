package ru.ezhov.propertiesReader;

public class PropertiesFactory {
    public final static Properties<String, String> getPropertiesFromUserDirectory(String nameFile) {
        return new UserHomeProperties(nameFile);
    }
}
