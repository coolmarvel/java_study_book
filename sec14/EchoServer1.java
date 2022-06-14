package sec14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer1 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        Socket connection = null;
        BufferedReader in = null;

        try {
            server = new ServerSocket(5000);
        } catch (IOException e) {
        }
        System.out.println("연결 대기중...");

        try {
            connection = server.accept();
        } catch (IOException e) {
        }
        System.out.println("메시지를 기다리는중...");

        in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String msg;

        while ((msg = in.readLine()) != null) {
            System.out.println("읽은 메시지 메아리 : " + msg);
        }

        System.out.println("서버 종료");
        in.close();
        connection.close();
        server.close();
    }
}
