import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" Enter Number Of Your Family");
        int numberOfFamily = reader.nextInt();
        Person[] myFamily = new Person[numberOfFamily];

        for ( int index = 0; index < myFamily.length; index++){
            System.out.println("Enter Name Of Person "+(index+1));
          Person familyList = new Person();
          familyList.name = reader.next();
            System.out.println("Enter Age Of Person "+(index+1));
            familyList.age = reader.nextByte();
            myFamily[index] = familyList;

        }
        for (int index = 0; index < myFamily.length; index++){
            System.out.println(myFamily[index].name+" "+myFamily[index].age);
        }

    }




}
