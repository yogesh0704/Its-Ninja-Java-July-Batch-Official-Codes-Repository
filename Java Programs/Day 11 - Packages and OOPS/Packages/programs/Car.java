package Packages.programs;
public class Car{
    private String brand;
    String model;
    String colour;
    int weight;
    int kmsDriven;

    // Constructor with parameters / assigning initial values 
   public Car(String brand, String model,String car, int weight)
    {
        int kmsDriven = 100;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.weight = weight;
        this.kmsDriven = kmsDriven;
    }
    
    public void start(String carName)
    {
        System.out.println(carName + " Car Engine Started");
    }
    public void driveFront(String carName)
    {       
        System.out.println(carName + " Driving Forward");
    }
    public String driveBack()
    {
        return "Reversing";
    }
    public void parked()
    {
        System.out.println("Car is Parked");
    }
}