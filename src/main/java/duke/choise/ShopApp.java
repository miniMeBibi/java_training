package duke.choise;

import java.lang.reflect.Array;

public class ShopApp {

    public static void main(String[] args){

        double tax = 0.2;
        double total = 0;

        System.out.println("Welcome to Duke Choise Shop!");

        Customer c1 = new Customer();

        c1.name = "Pinky";
        c1.size = "S";

        System.out.println("Hello customer "+ c1.name);
        System.out.println("The Customer size is: "+ c1.size);


        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] arrayClothing = {item1,item2, new Clothing(), new Clothing()};

        item1.description = "blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        arrayClothing[2].description = "Green Scarf";
        arrayClothing[2].price = 5.0;
        arrayClothing[2].size = "S";

        arrayClothing[3].description = "Blue T-Shirt";
        arrayClothing[3].price = 10.5;
        arrayClothing[3].size = "S";

        System.out.println("First items is a: "+ item1.description + " price is: "+ item1.price + " size is: "+ item1.size);
        System.out.println("2nd items is a: "+ item2.description + " price is: "+ item2.price + " size is: "+ item2.size);

        //two t-shits and one jacket
//        total = 2*(item2.price + item2.price*tax) + (item1.price + item1.price*tax);
//        System.out.println("The total amounth for 2 tshits and one jacket is: "+ total);

      //  total = (item1.price + item2.price *2) * (1 + tax);

        int measurement = 3;
        switch(measurement){
            case 1: case 2: case 3:
                c1.size= "S";
                break;
            case 4: case 5: case 6:
                c1.size = "M";
                break;
            case 7: case 8: case 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

        System.out.println("The Customer size is: "+ c1.size);

        for (Clothing clothing: arrayClothing){
            if(c1.size.equals(clothing.size)) {
                total = total + clothing.price;
                System.out.println("Items is a: " + clothing.description + " price is: " + clothing.price + " size is: " + clothing.size);
                if(total>15){
                    break;
                }
            }
        }
        System.out.println("The total amounth is: "+ total);

    }
}
