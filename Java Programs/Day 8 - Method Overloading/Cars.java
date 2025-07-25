class Cars
{
    String brand;
    String model;
    String colour;
    int weight;

    Cars()
    {       
    }

   /* Cars(String carBrand, String carModel, String carColour, int carWeight)
    {
        brand = carBrand;
        model = carModel;
        colour = carColour;
        weight = carWeight;
    }*/

    Cars(String brand, String model,String colour, int weight)
    {
        this.brand = brand;
        this.model = model;
        this.colour= colour;
        this.weight= weight;
        

    }
    void start(String carBrand)
    {
        System.out.println(carBrand + " Car Engine has Started");
    }

    void forward()
    {
        System.out.println("Car is moving forward");
    }

    void backward()
    {
        System.out.println("Car is moving backward");
    }

    int carWeight()
    {
      return weight;
    }

    
    public static void main(String args[])
    {
        Cars bmw = new Cars();
        final int x =10;
        final float pi = 3.14f;
        final float gravity = 9.8f;
        System.out.println(x);
       /* bmw.brand = "BMW";
        bmw.model = "310i";
        bmw.colour = "Red";
        bmw.weight = 1000;
        
        bmw.start(bmw.brand);
        bmw.forward();
        bmw.backward();
        System.out.println(bmw.carWeight());
        System.out.println(bmw.brand);
        
        Cars audi = new Cars("Audi","A3","Blue",2000);   
        audi.start(audi.brand);
        audi.forward();
        System.out.println(audi.model);*/
        x= 100;

        System.out.println(x);
    }
}