class InvalidAgeException extends Exception
{
    public InvalidAgeException(String m)
    {
        super(m);
    }
}

class Ex3
{

    static void validate( int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Age must be 18 or Above");
        }
        System.out.println("Valid Age: "+age);
    }

    public static void main(String args[])
    {
        try{
            validate(12);
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Caught an Exception "  + e.getMessage());
        }
    }
}