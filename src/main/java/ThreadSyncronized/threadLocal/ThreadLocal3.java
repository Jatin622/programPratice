package ThreadSyncronized.threadLocal;

public class ThreadLocal3 extends Thread {
    static Integer custId = 0;

    private static ThreadLocal tl = new ThreadLocal<>() {
        protected Integer initialValue() {
            return custId++;
        }
    };

    ThreadLocal3(String name) {
        super(name);
    }

    public void run() {

        System.out.println(Thread.currentThread().getName() + "executing with customer id" + tl.get());
    }
}

class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal3 c1=new ThreadLocal3("customer thread 1");
        ThreadLocal3 c2=new ThreadLocal3("customer thread 2");
        ThreadLocal3 c3=new ThreadLocal3("customer thread 3");
        ThreadLocal3 c4=new ThreadLocal3("customer thread 4");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}

//this id will be maintain by thread local we not make seperate variable