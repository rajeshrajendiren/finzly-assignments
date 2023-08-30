public class Teacher {
    int empid;
    String name;
    String Specialization;
    //String sec;


    public Teacher(int empid, String name, String specialization) {
        this.empid = empid;
        this.name = name;
        Specialization = specialization;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", Specialization='" + Specialization + '\'' +
                '}';
    }
}
