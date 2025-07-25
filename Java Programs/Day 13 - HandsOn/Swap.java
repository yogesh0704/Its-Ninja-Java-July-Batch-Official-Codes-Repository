class Swap
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        /* Swapping using 3rd Variable
        int c;
        c = a;
        a = b;
        b = c;*/

        //Swapping Without 3rd Variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A value: "+a);
        System.out.println("B value: "+b);
    }
}