package ThreadSyncronized.Thread;

public class MyThread1 extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Seeta thread");
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {

            }
        }

    }
}
        class ThreadJoinDemo {
            public static void main(String[] args) throws InterruptedException {

                MyThread t = new MyThread();
                t.start();
                t.join(); // rama thread wait until Seeta thread complete execution

                for (int i = 0; i < 10; i++) {

                    System.out.println("Ram thread");
                }
            }
        }


