package Chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeColorTest extends JFrame {
    ChangeColorTest() {
        setTitle("배경색 바꾸기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);

        JButton button = new JButton("클릭");
        JPanel panel = new JPanel();

        panel.add(button);
        add(panel);

        button.addActionListener(e -> {
            if (panel.getBackground() == Color.yellow) {
                panel.setBackground(null);
            } else {
                panel.setBackground(Color.yellow);
            }
        });
    }

    public static void main(String[] args) {
        new ChangeColorTest();
    }
}
