package task22;

public class task22
{
    public static void main(String[] args)
    {
        Animal cat1 = new Cat("fish", "at home");
        Animal cat2 = new Cat("meat", "outdoors");

        Animal horse1 = new Horse("wheat", "in forest");
        Animal horse2 = new Horse("grain", "in stable");

        Animal dog1 = new Dog("bone", "at home");
        Animal dog2 = new Dog("meat", "at home");

        Animal[] array = new Animal[] {cat1, cat2, horse1, horse2, dog1, dog2};

        for (int i = 0; i < 6; i++)
        {
            Vet.treatAnimal(array[i]);
        }
    }
}
