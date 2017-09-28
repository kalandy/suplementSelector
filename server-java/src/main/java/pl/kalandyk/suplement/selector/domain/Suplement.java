package pl.kalandyk.suplement.selector.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by marcinkalandyk on 02.05.2017.
 */
@Entity // pokazanie springowi ze Suplement jest tabela w bazie danych
public class Suplement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //automatyczne generowanie id
    private Long id;

    private String name;
    private String suplementDescription;
    private String howTo;
    private String linkUrl;

    public static void main(String[] args) {
        Suplement suplement = new Suplement();
        suplement.setName("Ashwagandha");
        suplement.setSuplementDescription("blabla");
        suplement.setHowTo("ssupdesc");
        System.out.println(suplement);
    }

    @Override
    public String toString() {
        return "Suplement{" +
                "name='" + name + '\'' +
                ", suplementDescription='" + suplementDescription + '\'' +
                ", howTo=" + howTo +
                ", linkUrl=" + linkUrl +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuplementDescription() {
        return suplementDescription;
    }

    public void setSuplementDescription(String suplementDescription) {
        this.suplementDescription = suplementDescription;
    }

    public String getHowTo() {
        return howTo;
    }

    public void setHowTo(String howTo) {
        this.howTo = howTo;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
}
