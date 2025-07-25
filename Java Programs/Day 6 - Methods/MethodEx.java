class MethodEx
{
    static int add(int a, int b)
    {
        return a+b;
    }
    
    static boolean eligible(int age)
    {
        if(age>=18)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        int a =100 , b= 200;
        int c ;
        c = add(a,b);
        c = c-50;
        System.out.println(c);
        int age = 20;
        boolean elg = eligible(age);

        if(elg)
        {
             System.out.println("Yes ELigible");
        }
    }
}