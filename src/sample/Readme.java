package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Readme {
    public static void main(String[] args) {
        System.out.println("Editor");
        
        File readme = new File("README.md");
        
        if (readme.exists()) {
            System.out.println("README findes. ");
        }
        else {
            System.out.println("sample.Readme findes ikke");

            try {
                PrintWriter filSkriver = new PrintWriter(readme);
                filSkriver.println("Hest");
                filSkriver.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
