class InvalidAgeEx extends Exception
{
    public InvalidAgeEx(String m)
    {
        super(m);
    }
}

public class Ex3 {
    
    public void validateAge(int age) throws InvalidAgeEx
    {
        if(age>= 18)
        {
            System.out.println("Eligible For Voting");
        }
        else{
        
            throw new InvalidAgeEx("The age is Not Eligible for Voting as it is below 18");
       
        }
    }
    public static void main(String[] args) {
        Ex3 ex = new Ex3();
        try {
        ex.validateAge(17);    
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
        System.out.println("Hello");
    }
}
