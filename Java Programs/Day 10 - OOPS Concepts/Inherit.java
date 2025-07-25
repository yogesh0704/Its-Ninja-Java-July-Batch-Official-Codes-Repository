class Parent
{
    int cash = 1000000;
    void farming()
    {
        System.out.println("Parent is a Farmer");
    }
}

class Child extends Parent
{
    void business()
    {
        System.out.println("Child is a businessman");
    }
}

class Inherit
{
    public static void main(String args[])
    {
        Child c = new Child();        
        c.farming();
        c.business();
        Parent p = new Parent();
        p.business();
        System.out.println(c.cash);

    }
}