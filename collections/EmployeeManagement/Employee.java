public class Employee {
    String name;
    int Age;

    public Employee(String name, int age, String dept, double salary) {
        this.name = name;
        Age = age;
        this.dept = dept;
        this.salary = salary;
    }

    String dept;
    double salary;

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ']';
    }


}
