import java.util.*;
class Switch2
{
    public static void main(String args[])
    {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number1 : ");
        num1 = sc.nextInt();
        System.out.println("Please enter number2 : ");
        num2 = sc.nextInt();
        System.out.println("Enter operation plus , minus or multiply");
        String c = sc.next();
        sc.close();
        

        switch(c)
        {            
            case "plus":
                System.out.println(num1+num2);
                break;
            case "minus":
                    System.out.println(num1 - num2);
                    break;
            case "multiply":
                System.out.println(num1 * num2);
                 break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}
