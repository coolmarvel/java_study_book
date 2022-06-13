package Chapter14;

import java.awt.BorderLayout;

import javax.swing.*;

public class Main4 extends JFrame {
    Main4() {
        setTitle("색상 선택기");

        JComboBox<String> colorList = new JComboBox<>();
        colorList.addItem("빨간색");
        colorList.addItem("초록색");
        colorList.addItem("파란색");

        JPanel jp1 = new JPanel();
        jp1.add(colorList);
        jp1.add(jp1, BorderLayout.NORTH);

        JPanel jp2 = new JPanel();
        JCheckBox backGround = new JCheckBox("배경색");
        JCheckBox forwGround = new JCheckBox("전경색");
        jp2.add(backGround);
        jp2.add(forwGround);
        add(jp2, BorderLayout.CENTER);

        JPanel jp3 = new JPanel();
        JButton ok = new JButton("예");
        JButton cancel = new JButton("아니오");
        jp3.add(ok);
        jp3.add(cancel);
        add(jp3, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main4();
    }
}
