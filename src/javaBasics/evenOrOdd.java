package javaBasics;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        int number;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter A Number");
        number = reader.nextInt();
        if(number % 2 == 0){
            System.out.println(number+" The Number Is Even");
        }
        else {
            System.out.println(number+" The Number Is Odd");
        }
    }
}
