class ArraysUse
{
    void add()
    {
        
    }
    public static void main(String args[])
    {
        int age[] = {50,20,21,5,23,21,9};
        int sum =0;
      /*  for(int i =0;  i<age.length; i++)
        {
          sum = sum + age[i];
        }
        int average = sum / age.length ;
        System.out.println("Average age is "+ average); */

       /* int lowest = age[0];

        for(int i = 0; i< age.length; i++)
        {
            if(lowest > age[i])
            {
                lowest = age[i];
            }
        }

        System.out.println("Lowest Number is  "+ lowest);*/

        int array [] [] ={ {1,2,3} , {4,5,6} };

        for (int i =0 ;i < array.length ; i ++)
        {
            for(int j =0; j < array[i].length; j++)
            {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }


    }
}