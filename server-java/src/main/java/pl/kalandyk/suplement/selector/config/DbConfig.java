package pl.kalandyk.suplement.selector.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    /**
     * Pokazanie springowi namiary na baze danych
     */
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();

        //ustawienia sterownika do bazy danych
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");

        //adres do bazy (w pliku)
        dataSourceBuilder.url("jdbc:sqlite:suplementSelector.db");

        return dataSourceBuilder.build();
    }
}