package ThreadSyncronized;


class Display {
    public void wish(String name) {
        for (int i = 0; i < 10; i++) {

            System.out.println("Good morning:"+name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(name);
            }
        }
    }
}

class MtThreadSync extends Thread {

    Display display;
    String name;

    public MtThreadSync(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    public void run() {
        display.wish(name);
    }
}

class synchronizedDemo {
    public static void main(String[] args) {

        Display d = new Display();
        MtThreadSync t1 = new MtThreadSync(d, "Dhoni");
        t1.start();
        t1.interrupt();
    }
}
