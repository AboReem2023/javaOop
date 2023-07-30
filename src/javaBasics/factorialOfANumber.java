package javaBasics;

import java.util.Scanner;

public class factorialOfANumber {
    public static void main(String[] args) {
        int num,result;
        result=1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter A Number");
        num = reader.nextInt();
        for ( int i = 1; i<=num; i++){
            result=result*i;
        }
        System.out.println(result);

    }
}
