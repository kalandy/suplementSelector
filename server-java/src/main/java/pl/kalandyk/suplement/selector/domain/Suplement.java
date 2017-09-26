package pl.kalandyk.suplement.selector.domain;

/**
 * Created by marcinkalandyk on 02.05.2017.
 */
public class Suplement {

    private String name;
    private String chosenSuplement;
    private String suplementDesription;
    private String howTo;
    private String linkUrl;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getChosenSuplement() {
        return chosenSuplement;
    }
    public void setChosenSuplement(String chosenSuplement) {
        this.chosenSuplement = chosenSuplement;
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
                ", chosenSuplement=" + chosenSuplement +
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
