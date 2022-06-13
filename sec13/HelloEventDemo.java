package sec13;

import javax.swing.*;
import java.awt.event.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class HelloEventDemo extends JFrame {
    HelloEventDemo() {
        setTitle("이벤트 맛보기");

        ActionListener l = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼을 클릭했습니다.");
            }
        };

        JButton button = new JButton("클릭");
        button.addActionListener(l);

        add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloEventDemo();
    }
}
