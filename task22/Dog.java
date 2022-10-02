package task22;

public class Dog extends Animal
{
    public Dog(String food, String location)
    {
        super(food, location);
    }

    public void makeNoise()
    {
        System.out.println("Gav");
    }

    public void eat()
    {
        System.out.println("Dog is eating");
    }

    public void sleep()
    {
        System.out.println("Dog is sleeping");
    }
}
