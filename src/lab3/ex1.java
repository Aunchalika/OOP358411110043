package lab3;

import java.time.Year;
import java.util.Scanner;

public class ex1 {
    public static void main(String[]args){

        String name;
        Scanner Sc = new Scanner(System.in);

        System.out.println("what is your nickname? : " );
        name= Sc.nextLine();
        System.out.println("hello,"+name );

        String age;
        System.out.println("how old aer you :" );
        age = Sc.nextLine();
        System.out.println("you are "+ age+"Year old");

        //if-eles
        int Score=1;
        if (Score>=1&&Score<=30 )
            System.out.println("เด็กเกิน");
        else if (Score>=31&&Score<=60)
            System.out.println("แก่จัง");
        else
            System.out.println("Invalid score");






    }//main
}//class


