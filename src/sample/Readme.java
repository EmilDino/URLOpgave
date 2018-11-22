package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Readme {

    public static void main(String[] args) {

        String filensIndhold;
        filensIndhold = readme();

        System.out.println("README INDEHOLDER: \n" + filensIndhold);

    }

    public static String readme() {

        String readmeTxt ="";

        System.out.println("Readme editor");

        File readme = new File("README.md");

        if(readme.exists()) {

            System.out.println("Readme findes - så der ikke oprettes ny readme. ");

        } else {
            System.out.println("Readme findes ikke - så jeg opretter hurtigt en readme. ");

            try {
                PrintWriter filSkriver = new PrintWriter(readme);
                filSkriver.println("Hest pølse");
                filSkriver.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        try {

            System.out.println("Nu indlæser jeg README'en.");

            Scanner in = new Scanner(readme);

            while(in.hasNext()) {
                String newLine = in.nextLine();
                //System.out.println(newLine);
                readmeTxt = readmeTxt + newLine + "\n";
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return readmeTxt;
    }

}