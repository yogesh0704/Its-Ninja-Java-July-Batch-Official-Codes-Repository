class Operators
{
    public static void main(String args[])
    {
        int maths,physics,sanskrit,hindi;
        int total;
        int chemistry = 85;
        maths = 80;
        physics = 91;
        sanskrit = 85;
        hindi = 95;

        total = maths + physics + sanskrit + hindi + chemistry;
        System.out.println("Addition: "+total);
        total = physics - maths ;
        System.out.println("Substraction: "+total);
        total = maths * physics;
        System.out.println("Multiplication: "+total);

        double percent = (maths + physics + chemistry + hindi + sanskrit) / 5  ;
        System.out.println("Percentage: "+percent);
        
        int mod = 11 % 5 ;
        System.out.println("Remainder: "+ (11/5));
        System.out.println("Remainder: "+mod);

        int count = 10;
        count = count + 1;
        count++;

        System.out.println("Count : "+count);
        count--;
        System.out.println("Count 2nd time : "+count);
    }
}