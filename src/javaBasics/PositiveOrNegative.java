package javaBasics;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        int num1, num2, result;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter The First Number");
        num1 =reader.nextInt();
        System.out.println("Enter The Second Number");
        num2 = reader.nextInt();
        result = num1 * num2;
        System.out.println(result);
        if(result > 0){
            System.out.println("The Result Is Positive");
        }
        else if(result < 0){
            System.out.println("The Result Is Negative");
        }
        else{
            System.out.println("The Result Is Zero");
        }
    }
}
