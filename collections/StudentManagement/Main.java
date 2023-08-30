import java.util.ArrayList;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> Students=new ArrayList<>();
        Student s1=new Student("ram",121,4,"A");
        Student s2=new Student("raj",122,4,"A");
        Student s3=new Student("raju",123,4,"A");
        Students.add(s1);
        Students.add(s2);
        Students.add(s3);
        ArrayList<Teacher> Teachers=new ArrayList<>();
        Teacher t1=new Teacher(1,"ramesh","chemistry");
        Teacher t2=new Teacher(2,"suresh","biology");
        Teachers.add(t1);
        Teachers.add(t2);
        DisplayStudent(Students);
        DisplayTeacher(Teachers);
    }
    public static void DisplayStudent(ArrayList<Student> r){
        for (Student o:r){
            System.out.println(o);
        }
    }
    public static void DisplayTeacher(ArrayList<Teacher> r){
        for (Teacher o:r){
            System.out.println(o);
        }
    }
    public static void exit(){
        System.exit(0);
    }
}