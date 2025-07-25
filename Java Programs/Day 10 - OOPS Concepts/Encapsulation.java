class Abc{
            int a = 10;
    private int b = 90;

    public void setNum(int num)
    {
        b = num;
    }
    

    public int getNum()
    {
        return b;
    }
}
class Encapsulation
{
    
    public static void main(String args [])
    {
        Abc obj = new Abc();
        System.out.println(obj.a);
        System.out.println(obj.getNum());
        obj.setNum(99);
        System.out.println(obj.getNum());
    }
}