package defineClasesCreatingObjects;


import java.util.Arrays;

public class ShopApp {

    public static void main(String[] args) {

        //   double tax = 0.2;
        //  double total = 0;
        System.out.println("Welcome to Duke Choise Shop!");
        System.out.println(Clothing.MIN_PRICE);
        System.out.println(Clothing.MIN_TAX);

        Customer c1 = new Customer("Pinky", 14);

        System.out.println("Hello customer " + c1.getName() + " The Customer size is: " + c1.getSize());

        Clothing item1 = new Clothing("blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] arrayClothing = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        System.out.println("First items is a: " + item1.getDescription() + " price is: " + item1.getPrice() + " size is: " + item1.getSize());
        System.out.println("2nd items is a: " + item2.getDescription() + " price is: " + item2.getPrice() + " size is: " + item2.getSize());

        int measurement = 3;
        c1.addItem(arrayClothing);
        //  c1.setSize(measurement);

        System.out.println("Hello customer " + c1.getName() + "The Customer size is: " + c1.getSize() + " , total: " + c1.getTotalClothingCost());
        for (Clothing clothing : c1.getItems()) {
            // System.out.println("Items " + clothing.getDescription());
            System.out.println("Item " + clothing);
        }

        //7.1
        int average = 0;
        int count = 0;
        for (Clothing clothing : c1.getItems()) {
            if (clothing.getSize().equals("L")) {
                count++;
                average += clothing.getPrice();
            }
        }
        try {
            average = average / count;
            System.out.println("Average price: " + average + " , Count " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero hero");
        }

        //8.1
        Arrays.sort(arrayClothing);
        for (Clothing clothing : c1.getItems()) {
            // System.out.println("Items " + clothing.getDescription());
            System.out.println("Item " + clothing);
        }

    }
}
