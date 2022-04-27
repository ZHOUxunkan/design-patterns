package com.zxk.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class Database {
    private Database() {
    }

    public static Properties getProperties(String database) {
        String filename = database + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("404");
        }
        return properties;
    }
}
