public class Ex2 {

    public String str;
    public void setName() throws NullPointerException
    {
        str = "";
        throw new NullPointerException("String is Null Exception");
    }
    public static void main(String[] args) {
        int a = 10;
        a = a+10;
        try {
            throw new ArithmeticException("Throwing Arithmetic Exception using THROW Keyword");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        Ex2 ex = new Ex2();
        try {
            ex.setName();    
        } catch (NullPointerException e) {
            System.out.println("Caught the Null Pointer Exception");
            System.out.println(e.getMessage());
        }
        
        
        System.out.println("Hello");
    }
}