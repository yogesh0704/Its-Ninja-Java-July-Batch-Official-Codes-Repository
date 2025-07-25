class MyThread1 extends Thread{
    public void run()
    {
        System.out.println("Thread "+ this.getName()+" is Running");
        System.out.println(this.getPriority());

       for(int i = 0; i<5; i++)
        {
            System.out.println("Thread 1");

            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}

class MyThread2 extends Thread {

    
    public void run() {
       
      System.out.println("Thread "+ this.getName()+" is Running");
      System.out.println(this.getPriority());
       for(int i = 0; i<5; i++)
        {
            System.out.println("Thread 2");
            if(i==3)
            {
                try {
                    this.wait(20000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            // Making the Thread Pause for a certain Time
           try {
                Thread.sleep(5000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("Tab 1");
        t2.setName("Tab 2");
        t1.setPriority(t1.MIN_PRIORITY);
        t2.setPriority(t1.MAX_PRIORITY);
        t1.start();
        t2.start();

        System.out.println("This is Outside Thread");
    }
}
