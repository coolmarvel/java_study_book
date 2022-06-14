package Chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardTest extends JFrame implements ActionListener {

    JPanel panel;
    Cards cards;

    CardTest() {
        setTitle("카드 레이아웃");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
        setLocationRelativeTo(null);

        panel = new JPanel(new GridLayout(0, 4, 10, 0));
        addButton("<", panel);
        addButton("<<", panel);
        addButton(">", panel);
        addButton(">>", panel);
        add(panel, BorderLayout.NORTH);

        cards = new Cards();
        add(cards, BorderLayout.CENTER);
    }

    public void addButton(String str, Container target) {
        JButton button = new JButton(str);
        button.addActionListener((ActionListener) this);
        target.add(button);
    }

    class Cards extends JPanel {
        CardLayout layout;

        public Cards() {
            layout = new CardLayout();
            setLayout(layout);

            for (int i = 0; i <= 3; i++) {
                JButton button = new JButton();
                button.setText("카드번호" + (i + 1) + "!");
                Color[] color = { Color.yellow, Color.blue, Color.RED };
                button.setBackground(color[i]);
                add(button, BorderLayout.CENTER);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("<<")) {
            cards.layout.first(cards);
        }
        if (e.getActionCommand().equals("<")) {
            cards.layout.first(cards);
        }
        if (e.getActionCommand().equals(">>")) {
            cards.layout.first(cards);
        }
        if (e.getActionCommand().equals(">")) {
            cards.layout.first(cards);
        }
    }

    public static void main(String[] args) {
        new CardTest();
    }
}
