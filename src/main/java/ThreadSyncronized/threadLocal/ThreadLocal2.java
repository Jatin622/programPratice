package ThreadSyncronized.threadLocal;

public class ThreadLocal2 {
    public static void main(String[] args) {

        ThreadLocal tl = new ThreadLocal<>();
        System.out.println(tl.get());//null
        tl.set("java");
        System.out.println(tl.get());// java
        tl.remove();
        System.out.println(tl.get());//null
    }
}
