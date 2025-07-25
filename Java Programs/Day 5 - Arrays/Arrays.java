import java.util.*;
class Arrays
{
    public static void main(String args[])
    {
       /* int arr[] = {10,20,30,40,50};
        int marks[] = new int[10];
        marks[0] = 100;
        marks[1] = 120;
        marks[2] = 150;
        marks[3] = 200;

        System.out.println("My array Size is : "+arr.length);
        for(int i = 0; i< arr.length ; i++ )
        {
        System.out.println("Element at Index : "+ i);
        System.out.println(arr[i]);
        }
*/        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Number of Cars - ");
        int size = sc.nextInt();

        String[] cars = new String[size];

         for(int i = 0; i<cars.length ; i++)
         {
            System.out.println("Please Enter Car Name - ");
            cars[i] = sc.next();
         }

     

    for(int i = 0; i<cars.length ; i++)
         {
            System.out.println("Car - "+ i);
            System.out.println(cars[i]);
            
         }

    }

        

    }
