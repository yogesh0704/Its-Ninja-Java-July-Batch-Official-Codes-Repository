class Counter
{

    public synchronized void increment(String threadName)
    {
        try {
            
        for(int i=0; i<10;i++)
        {        
        System.out.println(threadName + " Counter = " + i);
        }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}

class Thread1 extends Thread{
    Counter cnt;

    Thread1(Counter cnt)
    {
        this.cnt = cnt;
    }
    public void run()
    {   
        System.out.println(this.getName()+" Started");
        
        cnt.increment(this.getName());        
        
        System.out.println(this.getName()+" is Exiting");
        }
         
    }


public class Sync {

    public static void main(String[] args) {
        
        Counter cnt = new Counter();
        Thread1 t1 = new Thread1(cnt);
        Thread1 t2 = new Thread1(cnt);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
    
    }
    
}
