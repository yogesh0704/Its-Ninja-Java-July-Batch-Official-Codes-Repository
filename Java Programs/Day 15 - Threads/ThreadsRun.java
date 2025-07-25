class ThreadR1 implements Runnable{
    public void run()
    {
        System.out.println("Thread 1 is Running");
    }
}

class ThreadR2 implements Runnable{
    public void run()
    {
        System.out.println("Thread 2 is Running");
    }
}
public class ThreadsRun {
    public static void main(String[] args) {
        ThreadR1 t1 = new ThreadR1();
        ThreadR2 t2 = new ThreadR2();

        Thread obj = new Thread(t1);
        Thread obj2 = new Thread(t2);
        
        obj.start();
        obj2.start();

    }
}
