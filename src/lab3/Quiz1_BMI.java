package lab3;

import java.io.StreamCorruptedException;
import java.util.Scanner;

public class Quiz1_BMI {
    public static void main(String[]args){
        Double w,h;
        Scanner sc = new Scanner(System.in);

        System.out.println("น้ำหนักเท่าไหร่:");
        w = sc.nextDouble();
        System.out.println(" ส่วนสูงเท่าไหร่ (เมตร) ");
        h = sc.nextDouble();

        //calculate BMT
        Double bim = w/(h*h);
        System.out.println("BMI="+bim);
            //test coundition
        if (bim<=18.50)
            System.out.println("ผอม ");
        else if (bim>= 18.50&&bim<=22.90)
            System.out.println(" ปกติ ");
        else if (bim>= 23&&bim<=24.90)
        System.out.println("ท้วม");
        else if (bim >=25&&bim<=29.90)
        System.out.println(" อ้วน");

        else
            System.out.println("อ้วนมาก");









    }//main
}//class