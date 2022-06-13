package sec12;

import java.awt.ComponentOrientation;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo extends JFrame {
    FlowLayoutDemo() {
        setTitle("플로우 레이아웃");
        JPanel jp = new JPanel();
        jp.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JButton jb1 = new JButton("B 1");
        JButton jb2 = new JButton("버튼 2");
        JButton jb3 = new JButton("Button 3");
        JButton jb4 = new JButton("Button Four");
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        jp.add(jb4);
        add(jp);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
