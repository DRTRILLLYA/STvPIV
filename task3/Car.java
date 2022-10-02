package task3;

public abstract class Car
{
    String brand, type;
    int weight;
    Engine engine;

    public abstract void start();

    public abstract void stop();

    public static void turnRight()
    {
        System.out.println("Turn right");
    }

    public static void turnLeft()
    {
        System.out.println("Turn left");
    }

    public abstract void printInfo();
}
