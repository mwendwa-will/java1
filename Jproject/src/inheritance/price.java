package inheritance;

import java.util.Scanner;

public class price extends users {

    int discount;
    public price(String username, String password) {
        super(username, password);
    }



    @Override
    public String toString() {
        return "price{" +

                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner shop = new Scanner(System.in);
        price owner1 = new price("", "");
        String[] names;
        String[] price;

        boolean valid;
        names = new String[5];
        price = new String[5];


        if (shop.hasNextLine()) {
            System.out.println("Enter username");
            owner1.username = shop.nextLine();
            System.out.println("Enter password");
            owner1.password = shop.nextLine();
            valid = true;
        } else {
            System.out.println("Please input correct data ");
            valid = false;
        }

        int discamount = 0;
        int all_total = 0;
        for (int a = 0; a < 5; a++) {
            int cost = 0;
            int discount = 0;
            System.out.println("Enter item name");
            names[a] = shop.next();
            System.out.println("Enter item cost");
            cost=shop.nextInt();
            price[a]=String.valueOf(cost);


            if (cost <= 5000 && cost > 4000) {
                discount = 500;
            } else if (cost <= 4000 && cost > 3000) {
                discount = 400;

            } else if (cost <= 3000 && cost > 2000) {
                discount = 300;

            } else if (cost <= 2000 && cost > 1000) {
                discount = 200;

            } else if (cost <= 1000 && cost > 0) {
                discount = 100;

            } else {
                System.out.println("There is no such item price");
            }
            int total = cost - discount;
            all_total = 0;
            discamount = 0;
            all_total = all_total + total;
            discamount = discount + discount;

        }

        System.out.println(owner1.toString());
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + ": " + price[i]);
        }
        System.out.println("Total amount: " + all_total);
        System.out.println("Discounted amount: " + discamount);
    }
}

