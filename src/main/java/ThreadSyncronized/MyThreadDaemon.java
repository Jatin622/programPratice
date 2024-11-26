package ThreadSyncronized;

public class MyThreadDaemon extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("child thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

class DaemonThreadDem0 {
    public static void main(String[] args) {

        MyThreadDaemon t = new MyThreadDaemon();
        t.setDaemon(true); //line 1
        t.start();
        System.out.println("end of main thread");//responible to run main thread
    }
}
//whenever last non demon thread terminate automatically all daemon threads will be termnated irrespective of their position

//if we comment line 1 both parent and child thread are non daemon and hence both thread are executed until their complete

//if we are not cmnt line 1 then main thread is non daemon child thread is daemon hence whenver main thread terminate automatically  child thread terminate

//in this cas output is end of main thread follow by child thread