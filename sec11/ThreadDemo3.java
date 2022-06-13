package sec11;

public class ThreadDemo3 {
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

        new Thread(task).start();
    }
}
