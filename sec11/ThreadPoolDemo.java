package sec11;

import java.util.concurrent.Executor;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.print("잘가 ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
            }
        };

        // Executor exec = Executor.newCachedThreadPool();
        // exec.execute(task);
    }
}
