public class Car implements Vehicle,Access
{
    public void start()
    {
        System.out.println("Car Started");
    }
    public void accelerate()
    {
        System.out.println("Car is accelerating");
    }
    public void camera()
    {
        System.out.println("Camera has been installed");
    }
    public void mats()
    {
        System.out.println("Car mats have beed added");
    }
    public static void main(String args[])
    {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.camera();
        c.mats();
    }
}