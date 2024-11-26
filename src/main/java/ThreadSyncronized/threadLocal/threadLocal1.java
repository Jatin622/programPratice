package ThreadSyncronized.threadLocal;

public class threadLocal1 {
    public static void main(String[] args) {

        ThreadLocal tl = new ThreadLocal<>()
        {
          public Object initialValue(){
              return "abc";
          }
        };
        System.out.println(tl.get());//abc
        tl.set("java");
        System.out.println(tl.get());// java
        tl.remove();
        System.out.println(tl.get());//abc
    }
}
