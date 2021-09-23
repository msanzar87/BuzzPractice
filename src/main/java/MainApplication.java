import com.msanzar87.practice.Person;

public class MainApplication {


    public static void main(String[] args) {
        //String name, int age, boolean employed, double gpa
        Person p1 = new Person("Buzz", 34, false, 4.0);
        Person p2 = new Person("Munir", 54, false, 1.2);

        System.out.println(p1.getName() + " is friends with " + p2.getName());
        System.out.println(p2.getName() + " has a " + p2.getGpa() + " gpa.");
        //Change gpa

        p2.setGpa(3.0);

        //Buzz was wrong, Munir doesn't have a 1.2 gpa.
        System.out.println(p1.getName() + " was wrong. " + p2.getName() + " has a " + p2.getGpa() + " gpa.");

    }
}
