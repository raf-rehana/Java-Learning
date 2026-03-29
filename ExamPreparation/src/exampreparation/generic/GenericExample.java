
package exampreparation.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Rafiaah", 20));
        students.add(new Student("Rehana", 22));
        students.add(new Student("Sanjida", 21));


        for (Student s : students) {
            System.out.println(s);
        }
        
        
        
        
        
    }
}
