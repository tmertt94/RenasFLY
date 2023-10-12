package e2e.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;



public class ConfigReader {

    //We created this because we need to read our Configuration.properties file
    static Properties properties;

    public static Properties readProperties(String filePath) {
        try {
            FileInputStream fileInputStream=new FileInputStream(filePath);
            properties=new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return properties;
    }

    public static String getPropertyValue(String key) {
        return properties.getProperty(key);
    }
}

