

public class Transaction {
    public int pay(float amt){
        if(amt==1500){
            System.out.println("product Key approved for Silver plan");
            return 1;
        }

        else if (amt==1000) {
            System.out.println("product key approved for gold plan");
            return 1;



        } else if (amt==500) {
            System.out.println("product key approved for Platinum plan");
            return 1;


        }
        else {
            System.out.println("product key not approved");
            return 0;
        }
    }

}
