package sec10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) {
        String input = "D:\\Temp\\org.txt";
        String output = "D:\\Temp\\dup.txt";

        // try {
        // FileInputStream fis = new FileInputStream(input);
        // FileOutputStream fos = new FileOutputStream(output);
        // int c;
        // while ((c = fis.read()) != -1) {
        // fos.write(c);
        // }
        // } catch (IOException e) {
        // System.out.println("어이쿠!");
        // }

        try {
            FileReader fr = new FileReader(input);
            FileWriter fw = new FileWriter(output);
            int c;

            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        } catch (IOException e) {
            System.out.println("아이쿠!");
        }
    }
}
