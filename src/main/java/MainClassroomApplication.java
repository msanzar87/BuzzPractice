import com.msanzar87.practice.classroom.Classroom;
import com.msanzar87.practice.classroom.Student;

import java.util.ArrayList;
import java.util.List;

public class MainClassroomApplication {



    public static void main(String[] args) {
        // Create an ArrayList and add 5 students
        List<Student> students = new ArrayList<>();

        students.add(new Student("Buzz", 'M', 34));
        students.add(new Student("Munir",'M',34));
        students.add(new Student("Christian",'M', 42));
        students.add(new Student("Laura",'F',31));
        students.add(new Student("Melissa",'F',28));
        students.add(new Student("Pete",'N',27));

        // Create a classroom for the list of students to be enrolled in
        Classroom mathClass = new Classroom(students);

        // Iterate through the classroom and print each classmates name and gender
        for (int i = 0; i < ; i++) {

        }




    }



}
