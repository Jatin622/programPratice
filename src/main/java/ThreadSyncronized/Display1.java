package ThreadSyncronized;

public class Display1 {
    public synchronized void wish(String name) {
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

class MtThreadSync1 extends Thread {

    Display1 display;
    String name;

    public MtThreadSync1(Display1 display, String name) {
        this.display = display;
        this.name = name;
    }

    public void run() {
        display.wish(name);
    }
}

class synchronizedDemo1 {
    public static void main(String[] args) {
//if we not use syncronized the output the thread will run base on jvm

//if we use syncronized the output the thread will run base on jvm they print

        Display1 d = new Display1();
        MtThreadSync1 t1 = new MtThreadSync1(d, "Dhoni");
        MtThreadSync1 t2 = new MtThreadSync1(d, "Yuvraj");
        t1.start();
        t2.start();
    }
}
