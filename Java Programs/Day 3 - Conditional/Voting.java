import java.util.Scanner;
class Voting{
    public static void main(String args[])
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Age: ");
        age = sc.nextInt();
        sc.close();
        System.out.println("You have entered: "+age);

       /* if(age >=  18 && age<=35)
        {
            System.out.println("Eligible for Job");
        }
        else{
            System.out.println("Not eligible for JOB");
        }*/
       int bankBalance = 50000;
       char creditCard = 'A';
       if(age>=18)
       {
        if(bankBalance>10000)
        {
            if(creditCard == 'Y')
            {
                System.out.println("You are already Having credit card");
            }
            else if(creditCard == 'N')
            {
                System.out.println("You are eligible for credit card");
            }            
        }
        else{
            System.out.println("Not Eligible for Credit card");
        }
       }else{
        System.out.println("Your age is Under 18");
       }
    }
}

// Number positive negative 