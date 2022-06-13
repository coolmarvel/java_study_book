package sec12;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class ComponentDemo extends JFrame {
    ComponentDemo() {
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 220);
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

    void showCenter() {
        JPanel panel = new JPanel();
        JTextArea area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타납니다.");
        area.setEditable(false);
        area.setForeground(Color.RED);

        panel.add(area);

        add(panel, BorderLayout.CENTER);
    }

    void showSouth() {
        String[] color = { "red", "blue" };

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("계산");
        JComboBox<String> cb = new JComboBox<>(color);
        JButton reset = new JButton("리셋");

        panel.add(cal);
        panel.add(cb);
        panel.add(reset);

        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new ComponentDemo();
    }
}
