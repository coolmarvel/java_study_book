package sec12;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameDemo3 extends JFrame {
    JFrameDemo3() {
        setTitle("안녕, 스윙!");

        JButton jb = new JButton("버튼");
        add(jb);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameDemo3();
    }
}
