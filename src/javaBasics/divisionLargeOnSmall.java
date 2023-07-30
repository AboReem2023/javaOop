package javaBasics;

import java.util.Scanner;

public class divisionLargeOnSmall {
    public static void main(String[] args) {
        int num1, num2, result;
        result =0;
        Scanner reader =new Scanner(System.in);
        System.out.println("Enter The First Number");
        num1 = reader.nextInt();
        System.out.println("Enter The Second Number");
        num2 = reader.nextInt();
        if(num1 > num2){
            result = num1 / num2;
        } else if (num2 > num1) {
            result = num2 / num1;
        }
        else {
            System.out.println("The Two Numbers Are Equal");
        }
        System.out.println(result);
    }
}
