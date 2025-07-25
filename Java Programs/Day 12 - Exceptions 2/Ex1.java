class Ex1
{
    public static void main(String args[])
    {
        int a = 10;
        int[] arr = {10,20,30,40,50};
        try{


        System.out.println("Before Exception : "+a);
        


        try{
        System.out.println(arr[7]);
        }catch (ArrayIndexOutOfBoundsException e)
         {
             System.out.println("Exception raised "+ e.getMessage());
         }
        a = a/5;    
        String s=null;
         System.out.println(s.charAt(1));

        }
        catch (ArithmeticException e)
        {
             System.out.println("Exception Raised "+ e.getMessage());
        }
        catch(Exception e)
        {
             System.out.println(e.getMessage());
        }
        
        finally
        {
             System.out.println("Exceptions Handled");
        }
       
        System.out.println("After Exception");
        System.out.println(a);
    }
}