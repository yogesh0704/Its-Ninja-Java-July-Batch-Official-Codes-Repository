class Scope
{
    int abc = 100;

    void add(int a)
    {
        int sum = a + abc;
        System.out.println(a+abc);
    }
    public static void main(String args[])
    {
        int a = 10;
        Scope obj = new Scope();
        System.out.println(a * obj.abc);
        obj.add(10);

    }
}