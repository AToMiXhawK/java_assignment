// Program by Reymond

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {

        System.out.print("Enter the Source File name: ");
        String st1 = System.console().readLine();
        System.out.print("Enter the Target File name: ");
        String st2 = System.console().readLine();
        FileReader fr;
        FileWriter fw;
        try {
            fr = new FileReader(st1);
            try {
                fw = new FileWriter(st2);
                int ch;
                while ((ch = fr.read()) != -1)
                    fw.write((char) ch);
                fw.close();
            } catch (Exception e) {
                System.out.println("Output File Missing...");
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Input File Missing...");
        }
    }

}