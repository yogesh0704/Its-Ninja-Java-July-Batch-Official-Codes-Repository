class Age{
    public static void main(String args[])
    {
        int age= 25 ;
        char qouta ='Y';

        if(age>=18 && age <=35)
        {
            System.out.println("Eligible");
        }
        else if(age>=18 && age<=60 && qouta == 'Y')
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
}