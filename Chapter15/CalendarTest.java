package Chapter15;

import java.util.Calendar;

import javax.swing.*;

public class CalendarTest extends JFrame {
    CalendarTest() {
        setTitle("디지털 시계");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    class MyLabel extends JLabel implements Runnable {
        public MyLabel() {
            setText(getClockText());
            setHorizontalAlignment(JLabel.CENTER);
            new Thread(MyLabel.this).start();
        }

        public String getClockText() {
            Calendar c = Calendar.getInstance();
            int h = c.get(Calendar.HOUR_OF_DAY);
            int m = c.get(Calendar.MINUTE);
            int s = c.get(Calendar.SECOND);

            String str = new String(h + " :" + m + " :" + s);
            return str;
        }

        public void run() {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
                setText(getClockText());
            }
        }
    }

    public static void main(String[] args) {
        new CalendarTest();
    }
}
