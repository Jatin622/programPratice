package ThreadSyncronized.Thread;

public class MyThreadInterupt1 extends Thread {

    public void run() {

        for (int i = 0; i < 100; i++) {

            System.out.println("i am loading");
        }
        System.out.println("i want sleep");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            System.out.println("i am interpur");
        }
    }
}

class ThreadIn {
    public static void main(String[] args) {
        MyThreadInterupt1 t = new MyThreadInterupt1();

        t.start();

        t.interrupt();
        System.out.println("End of main thread");

    }
}