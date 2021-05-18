package defineClasesCreatingObjects;


public class ShopApp {

    public static void main(String[] args) {

        //   double tax = 0.2;
        //  double total = 0;

        System.out.println("Welcome to Duke Choise Shop!");

        Customer c1 = new Customer();

        c1.setName("Pinky");
        c1.setSize("S");

        System.out.println("Hello customer " + c1.getName() + "The Customer size is: " + c1.getSize());


        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] arrayClothing = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        arrayClothing[2].setDescription("Green Scarf");
        arrayClothing[2].setPrice(5.0);
        arrayClothing[2].setSize("S");

        arrayClothing[3].setDescription("Blue T-Shirt");
        arrayClothing[3].setPrice(10.5);
        arrayClothing[3].setSize("S");

        System.out.println("First items is a: " + item1.getDescription() + " price is: " + item1.getPrice() + " size is: " + item1.getSize());
        System.out.println("2nd items is a: " + item2.getDescription() + " price is: " + item2.getPrice() + " size is: " + item2.getSize());

        int measurement = 3;
        c1.addItem(arrayClothing);
        c1.setSize(measurement);

        System.out.println("Hello customer " + c1.getName() + "The Customer size is: " + c1.getSize() + " , total: " + c1.getTotalClothingCost());
        for (Clothing clothing : c1.getItems()) {
            System.out.println("Items " + clothing.getDescription());
        }

    }
}
