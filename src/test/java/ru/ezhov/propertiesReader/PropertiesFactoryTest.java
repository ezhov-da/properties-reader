package ru.ezhov.propertiesReader;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rrnezh on 04.12.2017.
 */
public class PropertiesFactoryTest {

    @Test
    public void getPropertiesFromUserDirectory() throws Exception {
        Properties<String, String> properties = PropertiesFactory.getPropertiesFromUserDirectory(".test");
        assertNotNull(properties);
    }

}