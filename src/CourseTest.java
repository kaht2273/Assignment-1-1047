import java.util.Scanner;

public class CourseTest
{
    public static void main(String[] args)
    {
        Course course = new Course();
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the course name: ");
        course.setCourseName(input.nextLine());


        System.out.println("Enter student names (type 'exit' to finish):");
        while (true)
        {
            System.out.print("Enter student name: ");
            String studentName = input.nextLine();
            if (studentName.equalsIgnoreCase("exit"))
            {
                break;
            }
            course.addStudent(studentName);
        }


        System.out.println("\nStudents in the course:");
        for (String student : course.getStudents())
        {
            System.out.println(student);
        }


        System.out.print("\nEnter the name of the student to drop: ");
        String studentToDrop = input.nextLine();
        course.dropStudent(studentToDrop);


        System.out.println("\nStudents after dropping " + studentToDrop + ":");
        for (String student : course.getStudents())
        {
            System.out.println(student);
        }


        course.clear();
        System.out.println("\nStudents after clearing the course:");
        System.out.println(course.getNumberOfStudents()+1);


    }
}
