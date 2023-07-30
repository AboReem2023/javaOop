package javaBasics;

import java.util.Scanner;

public class next10Numbers {
    public static void main(String[] args) {
        int num;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter A number");
        num = reader.nextInt();
//        for (int i =num+1; i<=num+10;i++){
//            System.out.println(i);
//        }
        //____________________ another solution

        for (int i = 1 ; i<=10; i++){
            System.out.println(num+i);
        }

    }
}




