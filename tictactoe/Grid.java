import java.util.Arrays;
public class Grid {
    char[][] g=new char[3][3];
    void prnt(){
        System.out.println(Arrays.deepToString(g)
                .replace("],","\n").replace(",","\t| ")
                .replaceAll("[\\[\\]]", " "));
    }
}
