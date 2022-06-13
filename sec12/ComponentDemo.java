package sec12;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class ComponentDemo extends JFrame {
    ComponentDemo() {
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showNorth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 105);
        setVisible(true);
    }

    void showNorth() {
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2, 0));

        JLabel jl1 = new JLabel("원의 반지름");
        JLabel jl2 = new JLabel("원의 넓이");

        JTextField jt1 = new JTextField(10);
        JTextField jt2 = new JTextField(10);

        jt2.setEnabled(false);
        jp1.add(jl1);
        jp1.add(jt1);
        jp2.add(jl2);
        jp2.add(jt2);
        panel.add(jp1);
        panel.add(jp2);

        add(panel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new ComponentDemo();
    }
}
