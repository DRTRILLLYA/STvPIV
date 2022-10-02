package task23;

public class Phone
{
    String number, model;
    int weight;

    public Phone()
    {

    }

    public Phone(String number, String model)
    {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight)
    {
        this(number, model);
        this.weight = weight;
    }

    public static void receiveCall(String name)
    {
        System.out.println("Calling: " + name);
    }

    public static void getNumber(String phoneNumber)
    {
        System.out.println("Calling from number: " + phoneNumber);
    }

    public static void receiveCall(String name, String phoneNumber)
    {
        System.out.println("Calling " + name + " from number: " + phoneNumber);
    }

    public static void sendMessage(String ... numbers)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }

}
