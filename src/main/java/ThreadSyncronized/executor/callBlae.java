package ThreadSyncronized.executor;

import java.util.concurrent.*;

public class callBlae implements Callable {
    int num;

    callBlae(int num) {
        this.num = num;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " is responsibilty to find sum of first " + num + " numbers");

        int sum = 0;
        for (int i = 1; i < num; i++) {

            sum += i;
        }
        return sum;
    }
}

class CallableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        callBlae[] job = {new callBlae(10),
                new callBlae(20),
                new callBlae(30), new callBlae(40), new callBlae(50), new callBlae(60)};

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (callBlae jobs : job) {

            Future f = service.submit(jobs);
            System.out.println(f.get());
        }
        service.shutdown();

    }
}