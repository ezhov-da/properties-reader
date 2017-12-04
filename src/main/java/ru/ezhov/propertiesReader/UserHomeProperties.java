package ru.ezhov.propertiesReader;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by rrnezh on 04.12.2017.
 */
class UserHomeProperties implements Properties<String, String> {

    private java.util.Properties properties;
    private String nameFile;

    UserHomeProperties(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getProperty(String property) {
        properties = new java.util.Properties();
        try {
            properties.load(new FileInputStream(System.getProperty("user.home") + "/" + nameFile));
        } catch (IOException e) {
            new RuntimeException(e);
        }

        return properties.getProperty(property);
    }
}
