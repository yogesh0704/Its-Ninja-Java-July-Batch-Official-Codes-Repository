class GrandFather
{
   
    void work()
    {
        System.out.println("Farming");
    }
}
class Father extends GrandFather
{
    @Override
    void work()
    {
        System.out.println("Employee");
    }
}
class Son extends Father
{
    @Override
    void work()
    {
      
        System.out.println("Air Force");
    }
}

class MethodORR
{
    public static void main(String args[])
    {
        
        Father f = new Father();
        Son s = new Son(); 

        f.work();
        s.work(); 

        Father fs = new Son();
        fs.work();
    }
}