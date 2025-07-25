class Ex2
{
    static void func() throws IllegalAccessException
    {
        System.out.println("Inside func() Method");
        throw new IllegalAccessException("Demo");
    }

    public static void main(String args[])
    {
        try{
        func();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("Caught the Exception in Main method");
        }
    }
}