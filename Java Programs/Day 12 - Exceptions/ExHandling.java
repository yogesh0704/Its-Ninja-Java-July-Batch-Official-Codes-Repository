class ExHandling 
{
    public static void main(String args[])
    {
        int i = 100;
        try{
            i = i/10;
          //  System.out.println(i);
     /*       try{
            String s = null;
            System.out.println(s.length());
            }catch(NullPointerException e)
             {
                 System.out.println("Your string is null please enter some data");
             }

          int arr[] = {1,2,3,4};
          System.out.println(arr[3]);  
          for(int j=0 ; j<arr.length;j++)
          {
            System.out.println(arr[j]);
          }
*/

                String str = "Hello";
                

        } catch(ArithmeticException e)
        {
            System.out.println("Please check your division again");
            i = 10/1;
            System.out.println(i);
        } 
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You are accessing out of bounds element please check your index");
        }
        catch(NullPointerException e)
             {
                 System.out.println("Your string is null please enter some data");
             }
             catch (NumberFormatException e)
             {
                System.out.println("Sorry You cannot Convert String into an Integer");
             }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("This is Finally block");
        }

        i = 200 +300 +400;
        System.out.println("End of the Code");
        
    }
}