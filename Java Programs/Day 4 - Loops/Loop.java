import java.util.*;
class Loop
{
    public static void main(String args[])
    {
        int c = 1;
        int num = 10;

        int password = "7777";
        int enter = "111";
       while(enter != password)
        {            
            if(c %2 == 0)
            {           
                c++;                
                continue;                
            }            
            
            System.out.println(c);
            c++;
        } 

       int table = 10;

       for(int i=1; i<=10 ; i++)
       {
         System.out.println(table + " X "+ i + " = " + (table*i));
       } */ 

      Scanner sc = new Scanner(System.in);
      int enter;
      int password = 7777;
      do{        
        System.out.println("Enter password ");
        enter = sc.nextInt();
        System.out.println("Entered password is "+ enter);
      } while(password != enter);
*/
    }
}