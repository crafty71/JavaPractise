package PProperties;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("hello","world");
        prop.setProperty("mary", "kitty");

        Set<String> keys = prop.stringPropertyNames();

        for(String key : keys) {
            String value = prop.getProperty(key);
            System.out.println(key+ " " +value);
        }

        FileWriter fileWriter = new FileWriter("prop");

        prop.store(fileWriter, "save data");

        FileInputStream in = new FileInputStream("prop");

        prop.load(in);

        System.out.println(prop);

        in.close();

        fileWriter.close();

//        System.out.println(prop);
    }
}
