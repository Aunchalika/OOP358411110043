package lab4;

import java.util.Scanner;

public class Quiz2_Operators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x,y;

        System.out.println("enter integer1");
        x= sc.nextInt();
        System.out.println("Enter integer2");
        y=sc.nextInt();
        //call methods

        System.out.println("sum="+sumt(x,y));
        System.out.println("sum="+supt(x,y));
        System.out.println("sum="+mult(x,y));
        System.out.println("sum="+divt(x,y));







    }//main

    private static int divt(int x, int y) {
        return x/ y;

    }

    private static int mult(int x, int y) {
        return x*y;
    }

    private static int supt(int x, int y) {
        return x-y;
    }

    private static int sumt(int x, int y) {
        return x+y;


    }


}//calss
