package pl.kalandyk.suplement.selector.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by marcinkalandyk on 02.05.2017.
 */

/*!
* \brief Klasa Suplement, klasa deklarująca zmienne suplementów
*
* pokazanie springowi ze Suplement jest tabela w bazie danych, automatyczne generowanie ID
*/
@Entity //pokazanie springowi ze Suplement jest tabela w bazie danych
public class Suplement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) /*!<automatyczne generowanie id */
    private Long id; /*!< zmienna ID do bazy danych */

    private String name; /*!< Nazwa suplementu */
    private String suplementDescription; /*!< Opis suplementu */
    private String howTo; /*!< Stosowanie suplementu, dawkowanie */
    private String linkUrl; /*!< Adres do strony z suplementem */

    public static void main(String[] args) {

    }

    @Override
    public String toString() { /*!< przeładowanie metody */
        return "Suplement{" +
                "name='" + name + '\'' +
                ", suplementDescription='" + suplementDescription + '\'' +
                ", howTo=" + howTo +
                ", linkUrl=" + linkUrl +
                '}';
    }


    public Long getId() {
        return id;
    } /*!< zmienna ID do bazy danych */

    public String getName() {
        return name;
    } /*!< pobranie nazwy suplementu */

    public void setName(String name) {
        this.name = name;
    } /*!< ustawienie nazwy suplementu */

    public String getSuplementDescription() {
        return suplementDescription;
    } /*!< pobranie opisu suplementu */

    public void setSuplementDescription(String suplementDescription) { /*!< ustawienie opisu suplementu */
        this.suplementDescription = suplementDescription;
    }

    public String getHowTo() {
        return howTo;
    } /*!<pobranie informacji o stosowaniu i dawkowaniu suplementu */

    public void setHowTo(String howTo) { this.howTo = howTo; } /*!< ustawienie informacji o stosowaniu i dawkowaniu suplementu */

    public String getLinkUrl() {
        return linkUrl;
    } /*!< zmienna adresu do strony z suplementem */

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    } /*!< ustawienie adresu do strony z suplementem */

    public void setId(Long id) {
        this.id = id;
    }
}
