package ThreadSyncronized;

public class SynchronizedBlock1 {
    public  void wish(String name) {
        for (int i = 0; i < 10; i++) {

            System.out.println("Good night:" + name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(name);
            }
        }
        synchronized (this) { // we use synchronized on objcect level this data will come in synchronized way
            for (int i = 0; i < 10; i++) {

                System.out.println("Good morning:" + name);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(name);
                }
            }
        }
    }
}

class MtThreadSync4 extends Thread {

    SynchronizedBlock1 synchronizedBlock1;
    String name;

    public MtThreadSync4(SynchronizedBlock1 synchronizedBlock1, String name) {
        this.synchronizedBlock1 = synchronizedBlock1;
        this.name = name;
    }

    public void run() {
        synchronizedBlock1.wish(name);
    }
}

class synchronizedDemoBlock {
    public static void main(String[] args) {
//if we not use syncronized the output the thread will run base on jvm

//if we use syncronized the output the thread will run base on jvm they print

        SynchronizedBlock1 d = new SynchronizedBlock1();
        MtThreadSync4 t1 = new MtThreadSync4(d, "Dhoni");
        MtThreadSync4 t2 = new MtThreadSync4(d, "Yuvraj");
        t1.start();
        t2.start();
    }
}