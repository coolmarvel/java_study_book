package sec11;

public class DaemonDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(task, "작업 스레드");
        t1.setDaemon(true);
        // 데몬을 주석 처리하면 메인 스레드를 종료해도 작업 스레드는 계속 실행
        // 데몬 스레드로 설정하면 메인 스레드가 종료될 때 작업 스레드도 종료된다.
        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("메인 스레드가 끝났습니다.");
    }
}
