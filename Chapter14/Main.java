package Chapter14;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        String result1 = null;
        String result2 = null;

        JOptionPane input = new JOptionPane();
        
        result1 = JOptionPane.showInputDialog(null, "첫 번째 숫자는?");
        result2 = JOptionPane.showInputDialog(null, "두 번째 숫자는?");

        int result = Integer.parseInt(result1) + Integer.parseInt(result2);
        JOptionPane.showMessageDialog(null, "합 = " + result, "메시지", JOptionPane.INFORMATION_MESSAGE);
    }
}
