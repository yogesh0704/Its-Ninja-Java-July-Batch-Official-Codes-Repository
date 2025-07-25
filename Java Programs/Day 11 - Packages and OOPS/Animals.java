class Dog implements Animal,WildAnimals
{
    public void animalSound()
    {
        System.out.println("Dog says Bow Bow");
    }
    public void colour()
    {
        System.out.println("Dog colour is Black");
    }
    public void wildSound()
    {
        System.out.println("Dog is not a Wild Animal");
    }
}

class Animals {
public static void main(String args[])
{
    Dog d = new Dog();
    d.animalSound();
    d.colour();
    d.wildSound();
    System.out.println(d.x);
    System.out.println(d.y);
}
}
