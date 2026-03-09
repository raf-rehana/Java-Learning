
package employee.model;

public class Employee {
     private int id;
    private String name;
    private String email;
    private  String phone;
    
    private int salary;
   

    public Employee(String name, String email, String phone, int salary) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(int id, String name, String email, String phone, int salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", salary=" + salary + '}';
    }

   
 


    
}
