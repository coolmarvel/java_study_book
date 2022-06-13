package sec12;

import javax.swing.JFrame;

public class JFrameDemo2 extends JFrame {
    JFrameDemo2() {
        setTitle("안녕, 스윙!");
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameDemo2();
    }
}
