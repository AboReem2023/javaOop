package Engineering;

import BioMedical.Engineer;
import Doctors.Doctor;
import Doctors.Pharmacy;
import inheritancePackage.GrandClass;
import inheritancePackage.ParentClass;
import inheritancePackage.SonClass;
import mathPackage.MathClass;
import mathPackage.MathParameters;

import java.util.Scanner;

public  class  Main {



    public static void main(String[] args) {
//        double result;
//        System.out.println("Select from menu( 1:sum 2:sub 3:mul 4:div 5:mod )");
////        Scanner reader = new Scanner(System.in);
//        int select = MathClass.reader.nextInt();
//        switch (select){
//            case 1 :
//             result = MathClass.sumFun();
//                System.out.println("Sum = "+result);
//                break;
//            case 2 :
//                result = MathClass.subFun();
//                System.out.println("Sub = "+result);
//                break;
//            case 3 :
//                 result= MathClass.mulFun();
//                System.out.println("Mul = "+result);
//                break;
//            case 4 :
//               result = MathClass.divFun();
//                System.out.println("Div = "+result);
//                break;
//            case 5 :
//                result = MathClass.modFun();
//                System.out.println("Mod = "+result);
//                break;
//            default:
//                System.out.println("Wrong Selection");
//
//        }

        /*Scanner reader = new Scanner(System.in);
        System.out.println("Choose From Menu 1: Engineer Or 2: Doctor ");
        int myNumber = reader.nextInt();
        switch (myNumber) {
            case 1:
                String name=Engineer.engineerName();
               String myPhone = Engineer.myPhoneNumber();
               double age = Engineer.myAge();
                System.out.println("Welcome Engineer "+name+
                        "\n Your Age Is "+age+
                        "\n Your Phone Number Is "+myPhone);

                break;
            case 2:
                Doctor.doctorName();
                break;
            default:
                System.out.println("Not In Menu");
                break;


        }

         */
//       int sum= MathParameters.sumFun(5,3);
//        System.out.println(sum);
//        GrandClass myGrand = new GrandClass() {
//            @Override
//            public void age() {
//                System.out.println("80");
//            }
//
//            @Override
//            public void length() {
//                System.out.println("140");
//            }
//
//            @Override
//            public void hobby() {
//                System.out.println("Paint");
//            }
//        };
//        myGrand.age();
//        myGrand.length();
//        myGrand.hobby();
//        ParentClass a = new ParentClass();
//        a.age();
//        a.length();
//        a.hobby();
//        SonClass n = new SonClass();
//        n.length();

        SonClass inter = new SonClass();
        inter.name();
        inter.age();
        inter.length();
        inter.job();
        inter.weight();
        inter.collage();
        inter.hobby();
    }

}














//                do {
//                    Pharmacy.reEnter();
//                }
//                while (myNumber != 1 || myNumber != 2);
//
