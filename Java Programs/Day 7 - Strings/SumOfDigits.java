public class SumOfDigits {

    public static void main(String[] args) {
        

        int num = 1234;
        int sum = 0;
        
        while(num>0)
        {
         int lastDigit = num%10;
         
         num = num/10;
         
         sum = sum + lastDigit ;
        }
    
     
         System.out.println(sum);
         
        
    }
    
}