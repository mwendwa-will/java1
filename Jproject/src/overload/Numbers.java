package overload;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner ovo=new Scanner(System.in);
    operation(ovo.nextLine(),ovo.nextLine());
    operation(ovo.nextInt(),ovo.nextInt());
    operation(ovo.nextDouble(),ovo.nextDouble());
    operation(ovo.nextFloat(),ovo.nextFloat());

    }
    public static int operation(int a, int b){
        int c= a-b;
        System.out.println(c);
        return c;
    }
    public static double operation(double a, double b){
        double c= a*b;
        System.out.println(c);
        return c;
    }
    public static float operation(float a, float b){
        float c= a/b;
        System.out.println(c);
        return c;
    }
    public static String operation(String a, String b){
        String c= a + b;
        System.out.println(c);
        return c;
    }


}
