package javaBasics;

import java.util.Scanner;

public class personAge {
    public static void main(String[] args) {
        byte age;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Your Age");
        age = reader.nextByte();
        if(age==1 || age ==2){
            System.out.println("Neonatal");
        }
        if(age >=3 && age <=14){
            System.out.println("Child");
        }
        if(age >=15 && age <=21){
            System.out.println("Young");
        }
        if(age >= 22){
            System.out.println("Adult");
        }
    }
}
