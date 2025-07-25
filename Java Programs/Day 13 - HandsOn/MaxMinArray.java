class MaxMinArray
{
    int getMin(int[] arr)
    {
        int result = arr[0];
        for(int i =0 ; i<arr.length; i++)
        {
            result= Math.min(result,arr[i]);
        }
        return result;
    }
    int getMax(int[] arr)
    {
        int result = arr[0];
        for(int i =0 ; i<arr.length; i++)
        {
            result= Math.max(result,arr[i]);
        }
        return result;
    }

    public static void main(String args[])
    {
        int [] arr = {145,120,46,36,78,1,5,56,23};
        MaxMinArray m = new MaxMinArray();
        System.out.println("Minimum = "+ m.getMin(arr));
        System.out.println("Maximum = "+ m.getMax(arr));
    }
}