abstract class Vehicle // Abstrract class represting a vehicle (hiding complexities)
{
    abstract void accelerate();
    abstract void brake(); // abstract methods

    void startEngine() // Concrete methods or Normal methods (Common to all vehicle)
    {
        System.out.println("Engine started");
    }
}

class Car extends Vehicle // extending abstract class implementing the class
{
    @Override
    void accelerate()
    {
        System.out.println("Car is accelerated");
        // Hidden logic : gear,fuel, motor
    }

    @Override
    void brake()
    {
        System.out.println("Car Brakes applied");
        // Hidden logic : brakepads, pressure
    }
}

abstract class Bike extends Vehicle
{
    @Override
    void accelerate()
    {
        System.out.println("Bike is accelerated");
    }

}

class Abstraction
{
    public static void main(String args[])
    {
        Car c = new Car();
       
        c.startEngine();
        c.accelerate();
        c.brake();

       

        Vehicle v = new Car();
        v.accelerate();
    }
}