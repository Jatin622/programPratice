package ThreadSyncronized.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintJob implements Runnable {
    String name;

    PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " job started by Thread:" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println(name + " job completed by thread " + Thread.currentThread().getName());
    }
}

class ExecutorServiceDemo {
    public static void main(String[] args) {

        PrintJob[] printJobs = {new PrintJob("durga"),
                new PrintJob("ravi"),
                new PrintJob("main"),
                new PrintJob("laptop"),
                new PrintJob("mouse"),
                new PrintJob("phone")};

        ExecutorService service = Executors.newFixedThreadPool(6);

        for (PrintJob job : printJobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}