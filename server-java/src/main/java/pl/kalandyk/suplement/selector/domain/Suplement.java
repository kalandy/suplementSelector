package pl.kalandyk.suplement.selector.domain;

/**
 * Created by marcinkalandyk on 02.05.2017.
 */
public class Suplement {

    private String name;
    private String suplementDesription;
    private String howTo;
    private String linkUrl;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getSuplementDesription() {
        return suplementDesription;
    }
    public void setSuplementDesription(String suplementDesription) {
        this.suplementDesription = suplementDesription;
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



    @Override
    public String toString() {
        return "Suplement{" +
                "name='" + name + '\'' +
                ", suplementDescription='" + suplementDesription + '\'' +
                ", howTo=" + howTo +
                ", linkUrl=" + linkUrl +
                '}';
    }

    public static void main(String[] args) {
        Suplement suplement = new Suplement();
        suplement.setName("Ashwagandha");
        suplement.setSuplementDesription("blabla");
        suplement.setHowTo("ssupdesc");
        System.out.println(suplement);

    }

}
