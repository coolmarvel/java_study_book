package Chapter12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamTest {
    public static void main(String[] args) {
        double[] num = { 0, 0, 0, 0, 0 };
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Temp\\double.txt"));
            DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Temp\\double.txt"));

            for (double d : num) {
                dos.writeDouble(d);
            }
            dos.flush();

            for (int i = 0; i < 5; i++) {
                System.out.println(dis.readDouble());
            }
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}
