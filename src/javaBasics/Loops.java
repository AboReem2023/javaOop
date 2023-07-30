package javaBasics;

public class Loops {
    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i);
//
//
//        }
//
//
//        System.out.println("=========================");
//        int x = 1;
//        while (x < 10) {
//            System.out.println(x);
//            x++;
//
//        }
//        System.out.println("=========================");
//        int y = 1;
//        do {
//            System.out.println(y);
//            y++;
//        }
//        while (y < 10);
//        System.out.println("==========================");
//        int j=1;
//        for ( ;;){
//            System.out.println(j);
//            j++;
//            if(j>=10){
//                break;
//            }
//        }

        String[] myList ={"mustafa","rahma","reem"};
        for (String n : myList){
            System.out.println(n);
        }
        System.out.println("===============");
        int j=0;
        while (j<myList.length){
            System.out.println(myList[j]);
            j++;
        }
        System.out.println("===============");

        int k=0;
        do {
            System.out.println(myList[k]);
            k++;
        }
        while (k<myList.length);

                }
            }


