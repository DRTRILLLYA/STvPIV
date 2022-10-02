package task23;

public class task23
{
    public static void main(String[] args)
    {
        Phone phone1 = new Phone("1", "Nokia", 150);
        Phone phone2 = new Phone("25", "Samsung", 150);
        Phone phone3 = new Phone("541", "Nokia", 150);
        Phone phone4 = new Phone("15", "Nokia", 150);
        Phone phone5 = new Phone("9", "Nokia", 150);

        Phone.receiveCall("Sergey");
        Phone.getNumber(phone5.number);
        Phone.receiveCall("Sergey", phone1.number);
        Phone.sendMessage(phone1.number, phone4.number);
    }
}
