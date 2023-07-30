package mathPackage;

import java.util.Scanner;

public class MathClass {
    public static Scanner reader = new Scanner(System.in);

    public static double sumFun() {
        System.out.println("Enter The First Number");
       double num1 = reader.nextDouble();
        System.out.println("Enter The Second Number");
        double num2 = reader.nextDouble();
        return num1 + num2;
    }

    public static double subFun() {
        System.out.println("Enter The First Number");
        double num1 = reader.nextDouble();
        System.out.println("Enter The Second Number");
        double num2 = reader.nextDouble();
        return num1 - num2;
    }

    public static double mulFun() {
        System.out.println("Enter The First Number");
        double num1 = reader.nextDouble();
        System.out.println("Enter The Second Number");
        double num2 = reader.nextDouble();
        return num1 * num2;
    }

    public static double divFun() {
        System.out.println("Enter The First Number");
        double num1 = reader.nextDouble();
        System.out.println("Enter The Second Number");
        double num2 = reader.nextDouble();
        return num1 / num2;
    }

    public static double modFun() {
        System.out.println("Enter The First Number");
        double num1 = reader.nextDouble();
        System.out.println("Enter The Second Number");
        double num2 = reader.nextDouble();
        return num1 % num2;
    }
}
