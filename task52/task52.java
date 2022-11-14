package task52;

public class task52
{
    public static void main(String[] args)
    {
        NewCollection<Integer> numbers = new NewCollection<Integer>();
        numbers.add(890541);
        numbers.add(4587);
        numbers.add(783615);
        numbers.add(12455);
        numbers.add(745637);

        System.out.println(numbers.size());

        numbers.remove(2);

        System.out.println(numbers.size());

        System.out.println(numbers.get(1));

        numbers.clear();
        System.out.println(numbers.size());
    }
}
