package duke.choise;

public class ShopApp {

    public static void main(String[] args){

        double tax = 0.2;
        double total;

        System.out.println("Welcome to Duke Choise Shop!");

        Customer c1 = new Customer();

        c1.name = "Pinky";

        System.out.println("Hello customer "+ c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.description = "blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        System.out.println("First items is a: "+ item1.description + " price is: "+ item1.price + " size is: "+ item1.size);
        System.out.println("2nd items is a: "+ item2.description + " price is: "+ item2.price + " size is: "+ item2.size);

        //two t-shits and one jacket
        total = 2*(item2.price + item2.price*tax) + (item1.price + item1.price*tax);
        System.out.println("The total amounth for 2 tshits and one jacket is: "+ total);

        total = (item1.price + item2.price *2) * (1 + tax);
        System.out.println("The total amounth for 2 tshits and one jacket is: "+ total);

        int[] classSize = {3,5};
        int a = classSize.length;
    }
}
