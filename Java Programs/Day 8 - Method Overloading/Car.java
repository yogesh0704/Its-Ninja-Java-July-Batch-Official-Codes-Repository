class Car
{
    private String brand;
    String model;
    String colour;
    int weight;
    int kmsDriven;

    // Default Constructor
    Car()
    {

    }
    // Constructor with parameters / assigning initial values 
    Car(String brand, String model,String car, int weight)
    {
        int kmsDriven = 100;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.weight = weight;
        this.kmsDriven = kmsDriven;
    }


    void start(String carName)
    {
        int a;
        System.out.println(carName + " Car Engine Started");
    }
    void driveFront(String carName)
    {
        String model= "samsung";
        System.out.println(this.model);
        System.out.println(carName + " Driving Forward");
    }
    String driveBack()
    {
        return "Ball";
    }
    void parked()
    {
        System.out.println("Car is Parked");
    }
    public static void main(String args[])
    {
      /*  Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "310i";
        bmw.colour ="Red";
        bmw.weight = 1000;
        bmw.start(bmw.brand);
        bmw.driveFront(bmw.model);

       /* Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A3";
        audi.colour = "Blue";
        audi.weight = 1200;
        audi.start(audi.brand);
        audi.driveFront(audi.model);
        audi.parked(); */
        Car audi = new Car("Audi","A5","Blue",1500);
        Car rr = new Car("Range Rover","Defender","Black",2000);
        System.out.println(audi.model);
        System.out.println(rr.brand);
        rr.driveFront(rr.brand);
        final int x = 10;
        final double pi = 3.14;
        final double gravity = 9.8;
        System.out.println(x);
       
        
    }
}