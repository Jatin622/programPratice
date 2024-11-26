package ThreadSyncronized;

public class Display2 {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {

            System.out.println("Good morning:" + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name);
            }
        }
    }
}

class MtThreadSync2 extends Thread {

    Display2 display;
    String name;

    public MtThreadSync2(Display2 display, String name) {
        this.display = display;
        this.name = name;
    }

    public void run() {
        display.wish(name);
    }
}

class synchronizedDemo2 {
    public static void main(String[] args) {

// we call 2 diff thread the output will come irregular both they lock one one thread they run simentinously

        Display2 d1 = new Display2();
        Display2 d2 = new Display2();
        MtThreadSync2 t1 = new MtThreadSync2(d1, "Dhoni");
        MtThreadSync2 t2 = new MtThreadSync2(d2, "Yuvraj");
        t1.start();
        t2.start();
    }
}
