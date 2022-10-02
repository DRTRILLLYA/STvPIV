package task21;

public class task21
{
    public static void main(String[] args)
    {
        Student student1 = new Aspirant("Ilya", "Gurov", "BAP1901", 5);
        Student student2 = new Aspirant("Denis", "Bobrov", "BAP1901", 4.5);
        Student student3 = new Student("Vasiliy", "Sass", "BRT1901", 2.98);
        Student student4 = new Student("Agent", "Karas", "BRT1901", 5);
        Student[] array = new Student[] {student1, student2, student3, student4};

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i].getScholarship());
        }

    }
}
