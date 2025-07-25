import java.util.Scanner;
class Pin{
    public static void main(String args[])
    {
        int atmPin;
        int bankPin = 1001;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your ATM PIN: ");
        atmPin = sc.nextInt();
        sc.close();
        System.out.println("You have entered: "+atmPin);

        if(atmPin ==  bankPin)
        {
            System.out.println("Successfull");
        }
        else{
            System.out.println("The pin you have entered is wrong");
        }
    }
}