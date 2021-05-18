package defineClasesCreatingObjects;

public class Customer {
    private String name;
    private String size;
    private Clothing[] items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }

    public void addItem(Clothing[] items) {
        this.items = items;

    }

    public Clothing[] getItems() {
        return items;

    }

    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing clothing : items) {
            //  if (clothing.getSize().equals(clothing.getSize())) {
            total = total + clothing.getPrice();
            //   total = total + total * tax;
            System.out.println("Items is a: " + clothing.getDescription() + " price is: " + clothing.getPrice() + " size is: " + clothing.getSize());
//                if (total > 15) {
//                    break;
//                }
            //   }
        }

        return total;
    }
}
