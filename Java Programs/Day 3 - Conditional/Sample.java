import java.util.*;

public class Sample {

    public static void main(String[]args){

    int a,b;
    Scanner sc=new Scanner(System.in);
    
     System.out.println("give a value");
     a=sc.nextInt();

     System.out.println("give b value");
     b=sc.nextInt();

     if(a>b){
        System.out.println("A is greater"+ a);
     }

     else if(a==b)
     {
        System.out.println("Both numbers are same");
     }
     else
     {
        System.out.println("B is greater"+ b);
     }
    }

    
}