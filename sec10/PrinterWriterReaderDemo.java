package sec10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinterWriterReaderDemo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Temp\\org.txt"));
            PrintWriter pr = new PrintWriter(new FileWriter("D\\Temp\\dup.txt"));
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}
