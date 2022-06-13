package Chapter14;

import javax.swing.*;
import java.awt.*;

public class Main7 extends JFrame {
    Main7() {
        setTitle("박스 레이아웃");
        setSize(360, 60);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container container = getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));

        for (int i = 1; i <= 5; i++) {
            container.add(new JButton("버튼 " + i));
        }
    }

    public static void main(String[] args) {
        new Main7();
    }
}
