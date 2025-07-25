package Packages.programs;

public class Pack{

    public void packageMethod()
    {
        System.out.println("This is Inside Package Method");
    }
    public void area()
    {
    System.out.println("Welcome to Area Calculation");
    }
     public void area(int side)
    {
        System.out.println( side * side);
    }
    public int area(int length, int breadth)
    {
     return 2*(length+breadth);  
    }
    public static void main(String args[])
    {
        Pack p = new Pack();
        p.packageMethod();
    }
}