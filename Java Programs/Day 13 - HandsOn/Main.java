class Main
{
    void factorial(int num)
    {
        int fact =1;
        for(int i=1; i<=num ; i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    boolean isPrime(int num)
    {
        if(num == 0 || num == 1)
        {
            return false;
        }
        if(num == 2)
        {
            return true;
        }
        for(int i = 2; i<num; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    boolean palindrome(String s)
    {
        boolean result = true;
        int length = s.length();
/*
        for(int i = 0; i<length/2; i++)
        {
            if(s.charAt(i) != s.charAt(length - 1 -i))
            {
                result = false;
                break;
            }
        }*/

       String rev ="";

       for(int i = length-1; i>=0 ; i-- )
       {
        rev = rev + s.charAt(i);
       }

       if(s.equals(rev))
       {
        result = true;
       }
       else
       {
        result = false;
       }
        return result;
    }

    public static void main(String args[])
    {
        Main m = new Main();
        m.factorial(5);
        System.out.println(m.isPrime(12));
        System.out.println("is palindrome : "+m.palindrome("NITINA"));
    }
}