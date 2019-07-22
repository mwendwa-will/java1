package inheritance;

import java.util.Scanner;

public class users {
    String username, password;

    public users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void users() {
        System.out.println(username+password);
    }

    @Override
    public String toString() {
        return "users{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner us=new Scanner(System.in);
        users poa=new users(us.nextLine(),us.nextLine());
        poa.username=us.nextLine();
        poa.password=us.nextLine();
        poa.users();
        System.out.println(poa.toString());


    }
}
