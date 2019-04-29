package pl.kalandyk.suplement.selector.config;

import org.springframework.beans.factory.annotation.Value;
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
    public DataSource dataSource(
            @Value("${db.url}") String dbUrl /* konfigurowalny adres do bazy*/) {

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();

        //ustawienia sterownika do bazy danych
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");

        //adres do bazy (w pliku)
        dataSourceBuilder.url(dbUrl);

        return dataSourceBuilder.build();
    }
}