package ThreadSyncronized.Thread;

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();

        //Thread.sleep(1000);// its not recommended because if our code run in 10 milisec why we waiting that much time

        b.join();// this is also not recommended because if we have a 1 crore line they till wait full code not implement
        System.out.println(b.total);
    }

    static class ThreadB extends Thread {

        int total = 0;

        public void run() {
            for (int i = 0; i <= 100; i++) {
                total = total + i;
            }
        }

    }

}
