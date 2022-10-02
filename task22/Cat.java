package task22;

public class Cat extends Animal
{
    public Cat(String food, String location)
    {
        super(food, location);
    }

    public void makeNoise()
    {
        System.out.println("Mew");
    }

    public void eat()
    {
        System.out.println("Cat is eating");
    }

    public void sleep()
    {
        System.out.println("Cat is sleeping");
    }
}
