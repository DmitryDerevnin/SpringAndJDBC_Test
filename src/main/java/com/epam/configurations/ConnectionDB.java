package com.epam.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class ConnectionDB {
    private String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://localhost:3306/mydb";

    private String DB_USER = "root";
    private String DB_PASSWORD = "12345";
    private String veryLongStr = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


    @Bean
    public DataSource dataSource() {
        System.out.println(DB_DRIVER + " " + DB_URL + " " + DB_USER + " " + DB_PASSWORD);
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName(DB_DRIVER);
        source.setUrl(DB_URL + veryLongStr);
        source.setUsername(DB_USER);
        source.setPassword(DB_PASSWORD);
        return source;
    }
}

