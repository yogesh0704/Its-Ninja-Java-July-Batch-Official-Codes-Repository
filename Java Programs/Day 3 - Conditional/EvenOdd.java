import java.util.Scanner;
class EvenOdd
{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number : ");
        num = sc.nextInt();
        sc.close();

        if(num % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println("ODD Number");
        }
        
    }
}