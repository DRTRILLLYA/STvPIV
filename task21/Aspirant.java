package task21;

import task21.Student;

public class Aspirant extends Student
{
    public Aspirant(String firstName, String lastName, String group, double averageMark)
    {
        super(firstName, lastName, group, averageMark);
    }
    public int getScholarship()
    {
        if(this.averageMark == 5) return 200; else return 180;
    }
}
