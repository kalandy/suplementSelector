package pl.kalandyk.suplement.selector.domain;

/**
 * Created by marcinkalandyk on 02.05.2017.
 */
public class Suplement {

    private String name;
    private Double price;
    private String description;
    private Short energy;
    private Short prohealthAction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getEnergy() {
        return energy;
    }

    public void setEnergy(Short energy) {
        this.energy = energy;
    }

    public Short getProhealthAction() {
        return prohealthAction;
    }

    @Override
    public String toString() {
        return "Suplement{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", energy=" + energy +
                ", prohealthAction=" + prohealthAction +
                '}';
    }

    public void setProhealthAction(Short prohealthAction) {
        this.prohealthAction = prohealthAction;
    }

    public static void main(String[] args) {
        Suplement suplement = new Suplement();
        suplement.setName("Ashwagandha");
        System.out.println(suplement);

    }
}
