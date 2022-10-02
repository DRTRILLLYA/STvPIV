package task22;

public class Horse extends Animal
{
    public Horse(String food, String location)
    {
        super(food, location);
    }

    public void makeNoise()
    {
        System.out.println("Igogo");
    }

    public void eat()
    {
        System.out.println("Horse is eating");
    }

    public void sleep()
    {
        System.out.println("Horse is sleeping");
    }
}
