package sec11;

class WorkerThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("잘가 ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}

public class ThreadDemo4 {
    public static void main(String[] args) {
        Thread t = new WorkerThread();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.print("안녕 ");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}
