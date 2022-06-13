package sec11;

class TotalTread extends Thread {
    int total;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            notify();
        }

    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        TotalTread t = new TotalTread();
        t.start();
        synchronized (t) {
            try {
                System.out.println("스레드 t가 끝낼때 까지 대기...");
                t.wait();
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        System.out.println("총합 : " + t.total);
    }
}
