package task21;

public class Student
{
    String firstName, lastName, group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark)
    {
        this.firstName = firstName;
        this.group = group;
        this.lastName = lastName;
        this.averageMark = averageMark;
    }

    public int getScholarship()
    {
        if(this.averageMark == 5) return 100; else return 80;
    }
}
