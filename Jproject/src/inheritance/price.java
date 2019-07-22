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
        price owner1 = new price("","");
        boolean valid;

        if (shop.hasNextLine()){
            System.out.println("Enter username");
            owner1.username=shop.nextLine();
            System.out.println("Enter password");
            owner1.password=shop.nextLine();
            valid=true;
        }else {
            System.out.println("Please input correct data ");
            valid=false;
        }


        int cost=shop.nextInt();
        int discount = 0;


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
        System.out.println(owner1.toString()+" Your discount is "+discount+" Total price will be "+total);
    }
}

