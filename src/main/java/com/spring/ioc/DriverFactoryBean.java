package com.spring.ioc;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Driver;
import java.sql.DriverManager;

/**
 * @author novLi
 * @date 2020年03月03日 12:24
 */
public class DriverFactoryBean implements FactoryBean {

    private String jdbcUrl;

    @Override
    public Object getObject() throws Exception {
        return DriverManager.getDriver(jdbcUrl);
    }

    @Override
    public Class<?> getObjectType() {
        return Driver.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
