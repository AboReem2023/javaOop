package javaBasics;

import java.util.Scanner;

public class numberBetween1And3 {
    public static void main(String[] args) {
        int num;
        Scanner reader = new Scanner(System.in);
        do {System.out.println("Enter A Number Between 1 & 3");
        num = reader.nextInt();}
        while (!(num >= 1 && num <= 3));
        System.out.println(num);

    }
}
