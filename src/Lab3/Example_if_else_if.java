package Lab3;
// Grade RUTS
// 0 - 49.99      F
// 50.00 - 54.99  D
// 55.00 - 59.99  D+
// 60.00 - 64.99  C
// 65.00 - 69.99  C+
// 70.00 - 74.99  B
// 75.00- 79.99   B+
// 80.00 - 100.00 A

import javax.management.StringValueExp;
import java.util.Scanner;

    public class Example_if_else_if {

        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your score, and I will tell your Grade:");
            double score = sc.nextDouble();
            //condition
            if (score>0 && score <=49.99){
                System.out.println("your grade is F.");
            }else if (score>50.00 && score <=54.99)
                System.out.println("your grade is D");
            else if (score>55.00 && score <=59.99)
                System.out.println("your grade is D+");
            else if (score>60.00 && score <=64.99)
                System.out.println("your grade is C");
            else if (score>65.00 && score <=69.99)
                System.out.println("your grade is C+");
            else if (score>70.00 && score <=74.99)
                System.out.println("your grade is B");
            else if (score>75.00 && score <=79.99)
                System.out.println("your grade is B+");
            else if (score>80.00 && score <=100.00)
                System.out.println("your grade is A ");
            else
                System.out.println("Please,enter score between 0-100. Thank you.");
        }


    }

