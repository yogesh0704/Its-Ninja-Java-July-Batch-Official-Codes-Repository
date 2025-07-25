class Method
{
    
    void calculator()
    {
        System.out.println("Welcome To MY Calculator");
    }
    void addition(int a, int b)
    {
        System.out.println(a+b);
    }
    int multiply(int x, int y)
    {
        int z = x*y;
        return z;
    }
    static int divide(int a, int b)
    {
        return a/b;
    }



    public static void main(String args[])
    {
        int a = 100, b = 200;
  
        Method obj = new Method();
        obj.calculator(); 
        obj.addition(a,b);        
        obj.addition(200,300);

        int c = obj.multiply(a,b);

        System.out.println(divide(b,a));
         System.out.println(Math.random(10));
    }
}