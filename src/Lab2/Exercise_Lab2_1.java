package Lab2;

import java.util.Scanner;

public class Exercise_Lab2_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number;
        System.out.print("Enter a number 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter a number 2: ");
        int b = scanner.nextInt();
        System.out.print("Enter a number 3: ");
        int c = scanner.nextInt();
        System.out.print("Enter a number 5: ");
        int d = scanner.nextInt();
        System.out.print("Enter a number 6: ");
        int f = scanner.nextInt();

        //finding
        int total = a + b + c + d + f;
        int avg = total /5;

        //display
        System.out.println("Total ="+total);
        System.out.println("Average ="+avg);



    }//main
}//class
