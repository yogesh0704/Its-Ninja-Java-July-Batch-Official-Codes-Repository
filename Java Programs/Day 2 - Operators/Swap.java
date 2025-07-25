import java.util.*;
class Swap
{
    public static void main(String args[])
    {
       int age=18;
       String name="shhu";
       Scanner sc = new Scanner(System.in);
       System.out.println("Hi Please tell me you name: ");
       name = sc.next();
       System.out.println("Hi Please tell me you Age: ");
       age = sc.nextInt();
       sc.close();
//       boolean result = age>=18;
       System.out.println("Your Name is : "+name);
       System.out.println("Your Age is : "+age);
    }
}