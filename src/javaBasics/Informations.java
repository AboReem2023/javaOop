package javaBasics;

import java.util.Scanner;

public class Informations {
    public static void main(String[] args) {
        String name, phoneNumber, nameOfCollage, hobbies;
        int grade;
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome:) Please Enter Your Name");
        name = reader.nextLine();
        System.out.println("Enter Your Phone Number");
        phoneNumber = reader.nextLine();
        System.out.println("Enter Your Hobbies ");
        hobbies = reader.nextLine();
        System.out.println("Enter Your Collage Name");
        nameOfCollage = reader.nextLine();
        System.out.println("Enter Your Grade");
        grade = reader.nextInt();
        System.out.println("Hi "+name+"\n"+"Your Phone Number is ["+phoneNumber+"]"+"\n"+"Your Hobbies are : "+hobbies+"\n"+"Your Collage Name is "+nameOfCollage+"\n"+"Your Grade Is : "+grade);

        if (grade >= 50 && grade <=60) {
            System.out.println("مقبول");
        }
            else if (grade < 50){
                System.out.println("راسب");
            }
        }
    }

