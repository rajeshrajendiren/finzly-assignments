import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Account> Accounts=new ArrayList<>();
        Account a1=new Account("ram",12345,"Savings");
        a1.deposit(1000);
        a1.withDraw(200);
        //a1.checkBalance();
        Account a2=new Account("krish",12346,"current");
        a2.deposit(2000);
        a2.withDraw(1200);
        //a1.checkBalance();
        Accounts.add(a1);
        Accounts.add(a2);
        list(Accounts);
    }
    public static void list(ArrayList<Account> l){
        for (Account i:l){
            System.out.println(i.toString());
        }
    }
}