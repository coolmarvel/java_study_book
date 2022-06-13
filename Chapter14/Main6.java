package Chapter14;

import javax.swing.*;
import java.awt.*;

public class Main6 extends JFrame {
    Main6() {
        setTitle("애완 동물");
        setSize(300, 110);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.setLayout(new FlowLayout());

        JPanel panel = new JPanel();

        JRadioButton dog = new JRadioButton("강아지");
        JRadioButton cat = new JRadioButton("고양이");
        JRadioButton goldFish = new JRadioButton("금붕어");

        dog.setSelected(true);

        ButtonGroup group = new ButtonGroup();

        group.add(dog);
        group.add(cat);
        group.add(goldFish);

        this.add(dog);
        this.add(cat);
        this.add(goldFish);

    }

    public static void main(String[] args) {
        new Main6();
    }
}
