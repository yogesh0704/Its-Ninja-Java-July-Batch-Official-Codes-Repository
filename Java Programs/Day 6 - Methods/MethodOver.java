class MethodOver
{
     void area()
    {
        System.out.println("Welcome to Area Calculation");
    }
     void area(int side)
    {
        System.out.println( side * side);
    }
    int area(int length, int breadth)
    {
     return 2*(length+breadth);  
    }
    public static void main(String args[])
    {
        MethodOver obj = new MethodOver();
        obj.area();
        int side = 5;
        obj.area(side);
        System.out.println(obj.area(10,20));

    }
}