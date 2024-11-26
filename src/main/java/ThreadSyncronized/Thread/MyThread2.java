package ThreadSyncronized.Thread;

public class MyThread2 extends Thread {

    static Thread mt;

    public void run() {
        try {
            mt.join(); //child thread call join method for main thread object
        } catch (InterruptedException e) { }

            for (int i = 0; i < 10; i++) {
                System.out.println("child thread");
            }

    }
}

class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {

        MyThread2.mt = Thread.currentThread();
        MyThread2 t = new MyThread2();
        t.start(); // they call child thread thy set join they wait until main thread not execute completely

        for(int i=0;i<10;i++){
            System.out.println("Main thread");
            Thread.sleep(1000);
        }
    }
}
