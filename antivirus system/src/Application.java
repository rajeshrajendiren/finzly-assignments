public class Application {
    Transaction t=new Transaction();
    final int ActivationKey=98776665;
    Application(float amt){
        System.out.println("plan for 1 year subcription(silver)");
        if(t.pay(amt)==1){
            System.out.println(this.ActivationKey);
        }


    }
    Application(int year,float amt){
        System.out.println("plan for"+year+"year subcription(platinum)");
        if(t.pay(amt)==1){
            System.out.println(this.ActivationKey);
        }
    }
}
