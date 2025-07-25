class AssignmentOperators
{
    public static void  main(String args[])
    {
        int x = 10;
        x++;
        System.out.println("1st : "+x);
        int maths = 60, chemistry =80;
        int age=22 , voting =18;        
        // assignment Operators
        /*maths += chemistry;
        System.out.println("after : "+maths);
        maths -= chemistry;
        System.out.println("after : "+maths);
        maths /= chemistry;
        System.out.println("after : "+maths);
        maths %= chemistry;
        System.out.println("after : "+maths);
// comparision Operators
        System.out.println(maths==chemistry);
        System.out.println(maths!=chemistry);
        System.out.println("Greater? "+ (maths>chemistry));
        System.out.println("Less? "+ (maths<chemistry));
        System.out.println("greather than or equal to ? "+ (age>=voting));
        System.out.println("Lesser than equal ? "+ (age<=voting));*/

        // logical operators
        boolean pass;
        maths = 60;
        chemistry =20;
       pass = (maths>35) || (chemistry>35);
        System.out.println(pass);
       System.out.println(!pass);
    }
}