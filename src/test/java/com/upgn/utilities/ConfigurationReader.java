package com.upgn.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    //1. create the object of Properties
    private static Properties properties = new Properties();

    static {

        try {
            //2. We need to open/read the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3. Load the properties object using the FileInputStream object
            properties.load(file);

            // close the file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the Configuration class");
        }

    }


    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
