import java.util.HashSet;
import java.util.Scanner;

public class ProjectDetail {
    String Detail;
    String projectName;
    HashSet<String> members=new HashSet<>();
    public ProjectDetail(String detail, String projectName) {
        Detail = detail;
        this.projectName = projectName;
        //this.members = members;
    }
    public  void addTeammembers(String n){

        this.members.add(n);
        }

    @Override
    public String toString() {
        return "ProjectDetail{" +
                "Detail='" + Detail + '\'' +
                ", projectName='" + projectName + '\'' +
                ", members=" + members +
                '}';
    }
}





