public class Student {
    String name;
    int roll;



    int std;
    String Section;

    public Student(String name, int roll, int std, String section) {
        this.name = name;
        this.roll = roll;
        this.std = std;
        Section = section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + roll +
                ", dept='" + std + '\'' +
                ", Section='" + Section + '\'' +
                '}';
    }
}
