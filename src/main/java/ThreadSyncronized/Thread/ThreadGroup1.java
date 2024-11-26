package ThreadSyncronized.Thread;

public class ThreadGroup1 {
    public static void main(String[] args) {

        ThreadGroup g1 = new ThreadGroup("tg"); // byy default max priority is 10

        Thread t1 = new Thread(g1, "thread1");// by default priority is 5
        Thread t2 = new Thread(g1, "thread2");// by default priority is 5  they can add in g1 because priority is higher

        g1.setMaxPriority(3); // we can change the priority 10 ->3

        Thread t3 = new Thread(g1, "Thread3");  // they also change the priority
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
}
