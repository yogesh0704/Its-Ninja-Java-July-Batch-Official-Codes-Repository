class Ex1
{
    static void func()
    {
        try{
            throw new NullPointerException("Demo for throw Keyword");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught the Exception in the Func() Method");
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static void main(String args[])
    {
        try{
        func();
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught the Exception in the Main Method");
        }
    }
}