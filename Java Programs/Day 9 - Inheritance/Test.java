class Encap
{
     private String name;
     private int age ;
     // Getter and Setter
     public void setName(String name)
     {
        this.name = name;
     }
     public String getName()
     {
        return this.name;
     }

     public void setAge(int age)
     {
        this. age = age;
     }
     public int getAge()
     {
        return age;
     }
    
}
class Test
{
public static void main(String args[])
    {
        Encap obj = new Encap();
        //System.out.println(obj.name);
        obj.setName("Yogesh");
        obj.setAge(25);
        System.out.println("My name is "+obj.getName());
        System.out.println("My age is "+obj.getAge());
    }
}