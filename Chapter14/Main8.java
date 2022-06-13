package Chapter14;

import javax.swing.*;
import java.awt.*;

public class Main8 extends JFrame {
    JPanel panel;
    Cards cards;

    Main8() {
        setTitle("카드 레이아웃");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        panel = new JPanel(new GridLayout(0, 4, 10, 0));

        addButton("<<", panel);
        addButton("<", panel);
        addButton(">", panel);
        addButton(">>", panel);
        add(panel, BorderLayout.NORTH);

        cards = new Cards();
        add(cards, BorderLayout.CENTER);

    }

    public void addButton(String str, Container target) {
        JButton button = new JButton(str);
        target.add(button);
    }

    class Cards extends JPanel {
        CardLayout layout;

        public Cards() {
            layout = new CardLayout();
            setLayout(layout);
            JButton button = new JButton();
            button.setText("카드 번호!!");
            add(button, BorderLayout.CENTER);
        }
    }

    public static void main(String[] args) {
        new Main8();
    }
}
