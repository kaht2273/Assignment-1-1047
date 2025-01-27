import java.util.Arrays;

public class Course
{
    private String courseName;
    private String[] students = new String[5];
    private int numberOfStudents = 0;


    public void setCourseName(String name)
    {
        courseName = name;
    }


    public void addStudent(String student) {
        if (numberOfStudents >= students.length)
        {

            students = Arrays.copyOf(students, students.length * 2);
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }


    public String[] getStudents()
    {
        return Arrays.copyOf(students, numberOfStudents);
    }


    public void dropStudent(String student)
    {
        for (int i = 0; i < numberOfStudents; i++)
        {
            if (students[i].equals(student))
            {

                for (int j = i; j < numberOfStudents - 1; j++)
                {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                return;
            }
        }
    }


    public void clear()
    {
        students = new String[5];
        numberOfStudents = 0;
    }


    public String getCourseName() {
        return courseName;
    }
    public int getNumberOfStudents()
    {
        return numberOfStudents ;

    }
}