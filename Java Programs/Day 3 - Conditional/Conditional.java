class Conditional
{
    public static void main(String args[])
    {
    int a = 5 , b = 10, c = 20 ; // Greatest Of 2 numbers
    if(a>b && a>c)
    {
        System.out.println("A is Greater than B and C");
    }
    else if(b>a && b>c)
    {
        System.out.println("B is Greater than A and C");
    }
    else
    {
        System.out.println("C is Greater than A and B");
    }
    }
}