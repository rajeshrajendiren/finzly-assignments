// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee("ram",21,"producton",20000);
        Employee e2=new Employee("krish",21,"testing",30000);
        Employee e3=new Employee("ram",21,"development",40000);
        HashMap<Integer,Employee> hm=new HashMap<>();
        hm.put(101,e1);
        hm.put(102,e2);
        hm.put(103,e3);
        view(hm);
        search(hm,104);




    }
    public static void view( HashMap<Integer,Employee> hm){
        for (Integer empid: hm.keySet()) {
            System.out.println(hm.get(empid).toString());

        }
    }


    public static void search(HashMap<Integer,Employee> hm, Integer id){
        if(hm.get(id)!=null) {
            System.out.println(hm.get(id));
        }
        else{
            System.out.println("employee not found");
        }

    }

}