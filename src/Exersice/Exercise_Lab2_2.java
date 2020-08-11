package Exersice;

import java.util.Scanner;

public class Exercise_Lab2_2 {
    public static void main (String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print(" ระบุคความยาวของฐานสามเหลี่ยม: ");
        double base = scanner.nextDouble();

        System.out.println("ระบุความสูงของสามเหลื่ยม");
        double high = scanner.nextDouble();

        double area =0.5 * base *high;
        System.out.println("พื้นที่สามเหลี่ยม คือ " +area);







    }//main
}//class
