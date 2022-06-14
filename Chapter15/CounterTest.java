package Chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterTest extends JFrame {
    CounterTest() {
        setTitle("카운터");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
        getContentPane().addMouseListener(new MyMouseListener());
    }

    class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);

            JPanel panel = (JPanel) e.getSource();
            panel.setBackground(new Color(r, g, b));
        }
    }

    public static void main(String[] args) {
        new CounterTest();
    }
}
