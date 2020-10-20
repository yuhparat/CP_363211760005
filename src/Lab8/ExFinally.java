package Lab8;

import java.io.*;

public class ExFinally {
    public static void main (String[] args){
        File myFile =new File("myFile.txt");
        BufferedReader readar = null;

        try {
            readar = new BufferedReader(new FileReader(myFile));
            String txt = null;

            while ((txt =readar.readLine()) !=null){
                //display
                System.out.println(txt);
            }//while
        } catch (FileNotFoundException e) {
            System.out.println("File could not found. ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not read text from file.");
            e.printStackTrace();
        }


    }
}
