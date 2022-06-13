package sec12;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NoLayoutDemo extends JFrame {
    NoLayoutDemo() {
        setTitle("절대 위치로 배치!");

        JPanel jp = new JPanel();
        jp.setLayout(null);

        JButton jb1 = new JButton("B 1");
        JButton jb2 = new JButton("버튼 2");
        JButton jb3 = new JButton("Button 3");
        jb1.setBounds(10, 10, 60, 30);
        jb2.setBounds(80, 20, 80, 25);
        jb3.setBounds(150, 30, 100, 30);
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        add(jp);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);

    }

    public static void main(String[] args) {
        new NoLayoutDemo();
    }
}
