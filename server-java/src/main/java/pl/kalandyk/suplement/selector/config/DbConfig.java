package pl.kalandyk.suplement.selector.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/*!
* \brief Klasa DbConfig, Klasa konfigurująca bazę danych
 *
 * Klasa konfigurująca bazę danych
*/
@Configuration
public class DbConfig {


    /*!
* \brief Pokazanie springowi namiarów na baze danych
*/
    @Bean
    public DataSource dataSource() { /*!< ustawienia sterownika do bazy danych,adres do bazy (w pliku) */
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();

        dataSourceBuilder.driverClassName("org.sqlite.JDBC"); //ustawienia sterownika do bazy danych

        dataSourceBuilder.url("jdbc:sqlite:suplementSelector.db"); //adres do bazy (w pliku)

        return dataSourceBuilder.build();
    }
}