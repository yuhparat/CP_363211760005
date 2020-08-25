package Lab4;

public class Example_BasicMethod {

    public static void B (int num){
        //statement
        System.out.println("Hello B.");


    }//B
    public static int C(int x,int y){
        //statement
        System.out.println("Hello C.");
        int sum = x + y;
        return sum;
    }//c
    public static void main(String[] args) {
        System.out.println("Hello Main.");
        //call A()
        A();
        A();
        A();
        B(100);
        int sum =C (100,200);
    System.out.println(sum);
    System.out.println(C(500,600));
    }//main
    public static void A(){
        //statement
        System.out.println("Hello A.");
        B(500);
    }//A
}//class
