class ECE
{
    
    private int rollNo;
    private String name;
    private int mobile;

    ECE(int rollNo, String name, int mobile){

        this.rollNo=rollNo;
        this.name=name;
        this.mobile=mobile;
    }

    ECE(){
        this.name="empty";
        this.rollNo=23;
        this.mobile=9849;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return this.name;
    }
 
 }
 
 public class Class {

    public static void main(String[]args){
        ECE student1 = new ECE();
        
        System.out.println(student1.getName());
    }
}