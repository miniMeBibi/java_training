package defineClasesCreatingObjects;

public class Clothing implements Comparable<Clothing> {

    private String description;
    private double price;
    private String size = "M";

    public static final double MIN_PRICE = 10.0;
    public static final double MIN_TAX = 0.2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * MIN_TAX);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return getDescription() + "," + getPrice() + ", " + getSize();
    }

    @Override
    public int compareTo(Clothing clothing) {
        return this.getDescription().compareTo(clothing.getDescription());
    }
}
