class Parent
{
    void business()
    {
        System.out.println("Farming");
    }
}

class Child extends Parent
{
    @Override
    void business()
    {
       // super.business();
        System.out.println("Rice mill");
    }

}


class MethodOverride{
    public static void main(String args[]){

        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();
        p.business();
        c.business();
        pc.business();
    }
}