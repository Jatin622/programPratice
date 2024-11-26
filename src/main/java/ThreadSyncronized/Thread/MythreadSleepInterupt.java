package ThreadSyncronized.Thread;

public class MythreadSleepInterupt extends Thread{
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {

                System.out.println("i am lazy thread");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("I got interupted");
        }
    }
}
class THreadSleepDemo{
    public static void main(String[]args){
        MythreadSleepInterupt t=new MythreadSleepInterupt();
        t.start(); // second  they print first i am lazy thread
        t.interrupt(); // after that they interupt they go in catch block and print
        System.out.println("End of main thread"); //t hey call first
    }
}