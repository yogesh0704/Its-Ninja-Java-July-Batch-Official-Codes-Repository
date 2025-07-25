class GrandFather
{
    int cash =80000;
    GrandFather(int appu)
    {
        cash = cash - appu;
        System.out.println("Father constructor called Grand Father Constructor");
    }
    void work()
    {
        System.out.println("Farming");
    }
}
class Father extends GrandFather
{
    Father()
    {    
        super(10000);
        System.out.println("Inside Father");
    
    }
    int fatherCash = super.cash;
    void work()
    {
        super.work();
        System.out.println("Employee");
    }
}
class Son extends Father
{
    int sonCash = super.fatherCash;
    void work()
    {
        super.work();
        System.out.println("Air Force");
    }
}

class MultiLevel
{
    public static void main(String args[])
    {
        Son s = new Son();
        //s.work();
       // s.work();
        s.work();
             System.out.println(s.cash);
       System.out.println(s.fatherCash);
      //  System.out.println(s.sonCash);
    }
}