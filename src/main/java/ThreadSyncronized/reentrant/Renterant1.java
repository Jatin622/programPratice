package ThreadSyncronized.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class Renterant1 extends Thread {

    static ReentrantLock l = new ReentrantLock();

    Renterant1(String name) {
        super(name);
    }

    public void run() {
        if (l.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "  got lock and perform opt");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                l.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "  unable to get lock");
        }
    }
}

class ReetrantDemo3 {
    public static void main(String[] args) {

        Renterant1 t1 = new Renterant1("FisstThread");
        Renterant1 t2 = new Renterant1("SecondThread");

        t1.start();
        t2.start();
    }
}
