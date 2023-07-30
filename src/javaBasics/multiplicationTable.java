package javaBasics;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        int num,result;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter A Nubmer");
        num = reader.nextInt();
        for ( int i = 1; i <=10; i++){
          result=num*i;
            System.out.println(num+" x "+i+" = "+result);
        }

    }
}
