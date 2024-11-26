package ThreadSyncronized.Thread;

public class THreadA {

    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b) {
            System.out.println("Main thread calling wait method");//step1
            b.wait();
            System.out.println("Main thread got notification");//step4
            System.out.println(b.total);//step5
        }
    }
}

class ThreadB extends Thread {

    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("child thread start calculation");//step 2
            for (int i = 0; i <= 100; i++) {
                total = total + i;
            }
            System.out.println("child thread giving notification");//step3
            this.notify();
        }
    }
}
