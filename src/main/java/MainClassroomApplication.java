import com.msanzar87.practice.classroom.Classroom;
import com.msanzar87.practice.classroom.Student;

import java.util.ArrayList;
import java.util.List;

public class MainClassroomApplication {



    public static void main(String[] args) {
        // Create an ArrayList and add 5 students
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Buzz", 'M', 34);
        Student s2 = new Student("Munir",'M',34);
        Student s3 = new Student("Christian",'M', 42);
        Student s4 = new Student("Laura",'F',31);
        Student s5 = new Student("Melissa",'F',28);
        // Create a classroom for the list of students to be enrolled in
        Classroom cs = new Classroom();

        // Iterate through the classroom and print each classmates name and gender



    }



}
