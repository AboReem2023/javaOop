package BioMedical;

import java.util.Scanner;

public class Engineer {
    static Scanner reader = new Scanner(System.in);

    public static String  engineerName(){
        System.out.println("Enter Your Name");
        return reader.nextLine();

    }
    public static String myPhoneNumber(){
        System.out.println("Enter Your Phone Number");
        return reader.nextLine();
    }
    public static int myAge(){
        System.out.println("Enter Your Age");
        return reader.nextInt();
    }






}

