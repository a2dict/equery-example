package com.a2dict.equeryexample.conf;

import io.ebean.Database;
import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by a2dict on 2019/11/10
 */
@Configuration
public class EBeanConfig {
    @Bean
    public EbeanServer database(DataSource dataSource) {
        return createEbeanServer("db", dataSource, true);
    }

    private static EbeanServer createEbeanServer(String name, DataSource dataSource, boolean defaultServer) {
        ServerConfig config = new ServerConfig();
        config.setName(name);
        config.setDefaultServer(defaultServer);
        config.setDataSource(dataSource);
        return EbeanServerFactory.create(config);
    }
}
