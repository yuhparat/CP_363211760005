package Lab3;

import java.util.Scanner;

public class Exersice_if_else {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter intger 1:");
        int x =sc.nextInt();
        System.out.print("Enter intger 2:");
        int y =sc.nextInt();
        //condition
        if (x>y){
            System.out.println( x+"grater than"+y);
        }else{
            System.out.println( x+"less than"+y);
        }
        System.out.println( " Good Bye ");

    }


}
