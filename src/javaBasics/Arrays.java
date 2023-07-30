package javaBasics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int[] myList = new int[5];
//        int sum = 0;
//        int average;
//        Scanner reader = new Scanner(System.in);
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println("Enter Number " + (i + 1));
//            myList[i] = reader.nextInt();
//            sum = sum + myList[i];
//        }
//        for (int i = 0; i < myList.length; i++) {
//
//            System.out.print(myList[i] + " ");
//        }
//        average = sum / myList.length;
//        System.out.println(sum);
//        System.out.println(average);
//
//        for ( int i = 0 ; i < myList.length ; i++){
//            if ( myList[i] > average){
//                System.out.println(myList[i]);
//            }
//        }

//        int[] myList1 = {4,8,7,9,1,5,4,6};
//        int[] myList2 = {7,6,5,2,1,3,7,4};
//        int[] myList3 = new int[myList1.length];
//        for ( int i = 0; i <myList1.length; i++){
//            myList3[i] = myList1[i] + myList2[i];
//            System.out.print(myList3[i]+" ");
//
//        }


//        int[] myList = new int [5];
//        int c;
//        System.out.println("Enter Five Numbers");
//        Scanner reader = new Scanner(System.in);
//        for (int i = 0;i<myList.length;i++){
//            myList[i]=reader.nextInt();
//        }
//        for (int i = 0;i<myList.length;i++){
//            for(int j=i+1;j<myList.length;j++){
//                if(myList[i]>myList[j]){
//                    c=myList[i];
//                    myList[i]=myList[j];
//                    myList[j]=c;
//                }
//
//            }
//            System.out.print(myList[i]+" ");
//
//        }
        int[] myList = new int [5];
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Five Numbers");
        for(int i = 0; i<myList.length;i++){
            System.out.println("Enter Number "+(i+1));
            myList[i] = reader.nextInt();

        }
        for (int i =0;i<myList.length;i++) {
            java.util.Arrays.sort(myList);
            System.out.print(myList[i]+" ");
        }


    }
}

