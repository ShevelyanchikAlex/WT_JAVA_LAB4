package com.bsuir.alex.hotel.connection_pool;

import com.bsuir.alex.hotel.connection_pool.constant.DBProperty;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionCreator {
    private static final String DRIVER_NOT_FOUND = "Driver is not found";
    private static final String FILE_NOT_FOUND = "File not found";

    public Connection createConnection() {
        try {
            Class<? extends ConnectionCreator> aClass = this.getClass();
            ClassLoader classLoader = aClass.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream(DBProperty.PROP_PROPERTIES);

            Properties property = new Properties();
            property.load(inputStream);

            String url = property.getProperty(DBProperty.PROP_URL);
            String name = property.getProperty(DBProperty.PROP_NAME);
            String password = property.getProperty(DBProperty.PROP_PASSWORD);
            String driver = property.getProperty(DBProperty.PROP_DRIVER);

            Class.forName(driver);
            return DriverManager.getConnection(url, name, password);
        } catch (SQLException e) {
            throw new IllegalArgumentException();
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(DRIVER_NOT_FOUND + e.getMessage(), e);
        } catch (IOException e) {
            throw new IllegalArgumentException(FILE_NOT_FOUND + e.getMessage(), e);
        }
    }
}
