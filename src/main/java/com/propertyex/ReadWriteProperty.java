package com.propertyex;

import java.io.*;
import java.util.Properties;

public class ReadWriteProperty {
    Properties properties = new Properties();

    private final static String FILE_NAME = "db_ config.properties";

    public void writeProperties() throws IOException {
        OutputStream outputStream = new FileOutputStream(FILE_NAME);
        properties.setProperty("username", "root");
        properties.setProperty("password", "root");
        properties.setProperty("port", "3306");
        properties.store(outputStream,"Stored Successfully !");

    }

    public void readProperties() throws IOException {
        InputStream inputStream = new FileInputStream(FILE_NAME);
        properties.load(inputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("port"));
    }

    public String loadProperty(String key) throws IOException {
        InputStream inputStream = new FileInputStream(FILE_NAME);
        properties.load(inputStream);
        return properties.getProperty(key);


    }

    public static void main(String [] args) throws IOException {
       // new ReadWriteProperty().writeProperties();
        new ReadWriteProperty().readProperties();


    }

}
