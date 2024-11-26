package ThreadSyncronized.Thread;

public class ThreadGroups extends MyThread {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup().getName()); // output= main

        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());//output= System

        ThreadGroup g1=new ThreadGroup("first threadGroup");
        System.out.println(g1.getParent().getName());

        ThreadGroup g2=new ThreadGroup(g1,"secondGroup");
        System.out.println(g2.getParent().getName());
    }
}

// system ->main ( is child group)

//main -> first group is child group
//first group -> second group is child group