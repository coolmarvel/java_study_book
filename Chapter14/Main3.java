package Chapter14;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main3 extends JFrame {
    Main3() {
        setTitle("섭씨 -> 화씨 변환");
        JPanel jp1 = new JPanel();
        JLabel cLabel = new JLabel("섭씨", JLabel.LEFT);
        JTextField cTemp = new JTextField(10);

        jp1.add(cLabel);
        jp1.add(cTemp);

        JPanel jp2 = new JPanel();
        JLabel fLabel = new JLabel("화씨", JLabel.RIGHT);
        JTextField fTemp = new JTextField(10);

        jp2.add(fLabel);
        jp2.add(fTemp);

        JPanel jp3 = new JPanel();
        JButton jb = new JButton("변환");

        jp3.add(jb);

        add(jp1, BorderLayout.NORTH);
        add(jp2, BorderLayout.CENTER);
        add(jp3, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 140);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main3();
    }
}
