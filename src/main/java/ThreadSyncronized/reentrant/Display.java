package ThreadSyncronized.reentrant;


import java.util.concurrent.locks.ReentrantLock;

public class Display {

    ReentrantLock l = new ReentrantLock();

    public void wish(String name) {

        l.lock(); //line1
        for (int i = 0; i < 10; i++) {

            System.out.println("Good morning:" + name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(name);
            }
        }
        l.unlock(); //line 2
    }
}

class MyThread122 extends Thread {
    Display d;
    String name;

    MyThread122(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

class ReentrantLockDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread122 t1 = new MyThread122(d, "dhoni");
        MyThread122 t2 = new MyThread122(d, "yuvaj");
        t1.start();
        t2.start();
    }
}

//if we comment line 1 and line 2 they will irregular output