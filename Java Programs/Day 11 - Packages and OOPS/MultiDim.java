class MultiDim{

    
    public static void main(String args[])
    {
        int count = 10;
        int arr[][] = { {1,2,3} , {4,5,6}  };
        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j=0; j < arr[i].length; j++)
            {
                arr[i][j] = count;
                count++;
                
            }
            
        }
        
        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j=0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");                                
            }
            System.out.println();
            int a=10; b =20;            
        }
    }
}