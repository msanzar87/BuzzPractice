import com.msanzar87.practice.classroom.Classroom;
import com.msanzar87.practice.classroom.Student;

import java.util.ArrayList;
import java.util.List;

public class MainClassroomApplication {



    public static void main(String[] args) {
        // Create an ArrayList and add 5 students



        // Create a classroom for the list of students to be enrolled in
        Classroom mathClass = new Classroom(new ArrayList<>());
        Classroom liberalArts = new Classroom(new ArrayList<>());

        mathClass.getStudents().add(new Student("Buzz", 'M', 34));
        liberalArts.getStudents().add(new Student("Kyle", 'M', 54));
        liberalArts.getStudents().add(new Student("Munir", 'M', 34));

        System.out.println(mathClass.getStudents().get(0).getName());


         //Iterate through the classroom and print each classmates name and gender
        for (int i = 0; i < liberalArts.getStudents().size(); i++) {
            System.out.println(liberalArts.getStudents().get(i).getName());

        }




    }



}
