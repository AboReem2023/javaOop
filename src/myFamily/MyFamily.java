package myFamily;

import java.util.Scanner;

public class MyFamily {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number Of Your Family");
        int numberOfFamily = reader.nextInt();
        Person[] familyInformations = new Person[numberOfFamily];
        for (int index = 0; index < familyInformations.length; index++){
            Person person = new Person();
            System.out.println("Enter Name Of Person "+(index+1));
            person.name = reader.next();
            System.out.println("Enter Age Of Person " +(index+1));
            person.age = reader.nextByte();
            familyInformations[index] = person;
        }
        for (int index = 0; index < familyInformations.length; index++){
            System.out.println(familyInformations[index].name+" "+familyInformations[index].age);
        }

        }

}
