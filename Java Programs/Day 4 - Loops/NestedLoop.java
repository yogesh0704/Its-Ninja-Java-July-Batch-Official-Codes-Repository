class NestedLoop
{
    public static void main(String args[])
    {
        int table = 5;
       for(int i=1; i<=table ; i++)
       {          

         for(int j=1; j<=i ; j++)
        {
            
           System.out.print("*");
         }

         System.out.println();
       } 
    }
}