import java.util.Scanner;
class SwitchP
{
    public static void main(String args[])
    {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number from 1 to 3 : ");
        day = sc.nextInt();
        sc.close();
        switch(day)
        {
            case 1: 
                  System.out.println("ONE");
                  break;  
            case 2:
                  System.out.println("TWO");
                    break;
            case 3:
                System.out.println("THREE");
                    break;
            default:
                System.out.println("NO ANSWER");                    
        }
        System.out.println("After closing");
    }
}
// 1-7 Day of week
// AEIOU Vowels 
