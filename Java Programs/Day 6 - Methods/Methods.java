class Methods
{
    void first()
    {
        System.out.println("Inside First Method");
    }
    void square(int a)
    {
        System.out.println(a*a);
    }

    int add2Nums(int a, int b)
    {
        int c = a + b;
        //return a+b;
        return c;
    }
    static String name(String sam)
    {
        sam = sam + "SAM method Called";
        return sam;
    }
    boolean eligible(int age)
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
        int sum;
        String hi = "Hiiiii ";
        Methods obj = new Methods();
        obj.first();
        obj.square(5);
        sum = obj.add2Nums(10,20);
        System.out.println(sum);
        System.out.println(Methods.name(hi));
        System.out.println(obj.eligible(20));
    }
}