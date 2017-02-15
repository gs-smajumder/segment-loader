package com.gainsight.segmentloader.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by samujjal on 15/02/17.
 */
public class Constants {
    static Logger LOGGER = LoggerFactory.getLogger(Constants.class);
    public static Properties properties = new Properties();

    static {
        String propertyFileName = "appconfig.properties";
        InputStream inputStream = Constants.class.getClassLoader().getResourceAsStream(propertyFileName);
        if(inputStream != null){
            try {
                properties.load(inputStream);
                inputStream.close();
                LOGGER.info("loaded properties");
            } catch (IOException e) {
                LOGGER.error(e.getMessage());
            }

        }


    }
}
