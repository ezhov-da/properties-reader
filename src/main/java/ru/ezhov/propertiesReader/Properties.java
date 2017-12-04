package ru.ezhov.propertiesReader;

/**
 * Created by rrnezh on 04.12.2017.
 */
public interface Properties<T, V>  {
    T getProperty(V v);
}
