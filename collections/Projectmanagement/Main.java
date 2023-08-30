import java.util.HashMap;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<String,ProjectDetail> project=new HashMap<>();
        ProjectDetail pd=new ProjectDetail("Project A","develop web appllication");
        pd.addTeammembers("ram");
        pd.addTeammembers("krish");
        ProjectDetail pd1=new ProjectDetail("Project b","develop web appllication");

        pd1.addTeammembers("raj");
        pd1.addTeammembers("kumar");
        project.put("project A",pd);
        project.put("project B",pd1);
        listProjectDetail(project);
        listProject(project);


    }
    public static void listProjectDetail(HashMap<String,ProjectDetail> l){
        for ( String i:l.keySet()){
            System.out.println(i);
        }
    }
    public static void listProject(HashMap<String,ProjectDetail> l){
        for ( ProjectDetail i:l.values()){
            System.out.println(i.toString());
        }
    }

    }
