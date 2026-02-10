package personAllCategory;

public class Student {

    String name;
    int age;
    String fatherName;
    String motherName;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String fatherName, String motherName) {
        this.name = name;
        this.age = age;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getfatherName() {
        return fatherName;
    }

    public void setfatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getmotherName() {
        return motherName;
    }

    public void setmotherName(String motherName) {
        this.motherName = motherName;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name + "\n" + this.name + "'s Age is "
                + this.age + "\nHer/His Father Name is " + this.fatherName + "\nHer/His Father Name is " + this.fatherName;

    }

}
