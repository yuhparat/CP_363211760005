package Lab3;
import java.util.Scanner;
// รับค่าจำนวนเติมจากผู้ใช้ เมื่อผู้ใช้ใส่คำ 0 ให้จบการทำงาน (While)
public class Example_While {
    public static void main (String[] args){

            Scanner sc = new Scanner(System.in);

            int num = 1;
            while (num !=0) {
                System.out.println("Enter integer :");
                num = sc.nextInt();
            }
            System.out.println("End.Good Bye.");





        }//main




    }//class

