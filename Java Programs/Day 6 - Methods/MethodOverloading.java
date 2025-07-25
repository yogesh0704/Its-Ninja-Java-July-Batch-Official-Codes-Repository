class MethodOverloading
{
    void area(int side)
    {
System.out.println(side * side);
    }
    void area(int length , int breadth)
    {
System.out.println(2*(length+breadth));
    }   
    void area(int a, int b, int c)
    {
        System.out.println(a*b*c);
    }
    
    
    public static void main(String ags[])
    {
        MethodOverloading obj = new MethodOverloading();
        obj.area(5);
        obj.area(10);
        obj.area(25);
        obj.area(5,10);
        obj.area(6,10,9);
    }
}