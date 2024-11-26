package ThreadSyncronized;

public class SyncronizedBlock2 {
    public void wish(String name) {
        for (int i = 0; i < 10; i++) {

            System.out.println("Good night:" + name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(name);
            }
        }
        synchronized (SyncronizedBlock2.class) { // we use synchronized on class level because object has 2 so the output is irregular
                                                // this data will come in synchronized way for class level
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

class MtThreadSync5 extends Thread {

    SyncronizedBlock2 synchronizedBlock2;
    String name;

    public MtThreadSync5(SyncronizedBlock2 synchronizedBlock2, String name) {
        this.synchronizedBlock2 = synchronizedBlock2;
        this.name = name;
    }

    public void run() {
        synchronizedBlock2.wish(name);
    }
}

class synchronizedDemoBlock2 {
    public static void main(String[] args) {

        SyncronizedBlock2 d = new SyncronizedBlock2();
        SyncronizedBlock2 d2 = new SyncronizedBlock2();
        MtThreadSync5 t1 = new MtThreadSync5(d, "Dhoni");
        MtThreadSync5 t2 = new MtThreadSync5(d2, "Yuvraj");
        t1.start();
        t2.start();
    }
}
