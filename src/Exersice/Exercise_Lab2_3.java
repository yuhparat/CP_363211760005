package Exersice;

import java.util.Scanner;
//global


public class Exercise_Lab2_3 {
    //global
    public static final double PI =3.141;
        public static void main (String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Knter radius of circle:");

    double r = scanner.nextDouble();

    double v =(4/3) * PI * r * r * r;

    System.out.println("The capacily of circle is : "+v);






    }


}
