// Abstract class representing a vehicle (Hiding implementation details)
abstract class Vehicle{
    // Abstract methods(What it can do)
    abstract void accelerate();
    abstract void brake();
    //Normal / Concrete method (Common To All Vehicles)
    void start()
    {
        System.out.println("Engine Started");
    }
}

// Abstract class implementation
class Bike extends Vehicle
{
   @Override
   void accelerate(){
    System.out.println("Bike: accelerated");
    // Gear 
    // fuel inject
    //clutch
    // engine working...
   }

   @Override
   void brake()
   {
    System.out.println("Bike: Brake Applied");
    // Break pads
    // Disk brake
    // pressure
   }
}
// Abstract class implementation
class Car extends Vehicle
{
    @Override
   void accelerate(){
    System.out.println("Car: accelerated");
    // Automatic transmission 
    // Diesel
    // engine working...
   }

   @Override
   void brake()
   {
    System.out.println("Car: Brake Applied");
    // Brake pads
    // Disk brake
    // pressure
   }
}

public class Abstraction
{
    public static void main(String args[])
    {
        Vehicle fz = new Bike();
        Vehicle verna = new Car();
        fz.start();
        fz.accelerate();
        fz.brake();

        verna.start();
        verna.accelerate();
        verna.brake();
    }
}