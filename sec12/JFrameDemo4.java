package sec12;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameDemo4 extends JFrame {
    JFrameDemo4() {
        setTitle("안녕, 스윙!");
        JPanel jp = new JPanel();
        JLabel jl = new JLabel();
        JButton jb = new JButton();
        jp.add(jl);
        jp.add(jb);
        add(jp);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameDemo4();
    }
}
