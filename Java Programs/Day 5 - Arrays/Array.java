import java.util.*;
class Array{
    public static void main(String args[])
    {
        int arr[] = {10,20,5,30,40,50};
        //int[] arr = {10,20,30,40,50};
        int sum=0;
        int abc[] = new int[10];

        //System.out.print(arr[0]);
       /* for(int i = 0 ; i<5 ; i++)
        {
            abc[i] = i;
        }       

         for(int i = 0 ; i<arr.length ; i++)
        {
            sum += arr[i];
           
        }       
         System.out.println(sum);*/
     /*   int low = arr[0];
        for(int i = 0 ; i<arr.length; i++)
        {
            if(low > arr[i])
            {
                low = arr[i];
            }
        }

        System.out.println(low); */ 

    for (int i : arr)
    {
        System.out.println(i);
    }

    }
}