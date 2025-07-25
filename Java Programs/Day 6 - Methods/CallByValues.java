
public class CallByValues {

       public static void main(String[]args){
        
        int a=5;
        int b=20;
        product(2.2,10);
        product(2,10);
        product();
    }
    static void product(double a, double b){
    System.out.println(a*b);
     }
    static void product(int a, int b){
    System.out.println(a*b);
    }
    static void product(){
       System.out.println(10*30); 
   }
}