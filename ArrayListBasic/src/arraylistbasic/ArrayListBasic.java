package arraylistbasic;

import java.util.ArrayList;
import arraylistbasic.entity.Student;

public class ArrayListBasic {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(111, "Rafiaah", "rafiaah@gmail.com", "018190000"));
        studentList.add(new Student(112, "Juyena", "Juyena@gmail.com", "018190000"));
        studentList.add(new Student(113, "Sanjida", "sanjida@gmail.com", "018190000"));
        studentList.add(new Student(114, "Arshiya", "arshiya@gmail.com", "018190000"));

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

}
