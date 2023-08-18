public class Bankaccount {
    private long accountNumber;
    private float balance;
    private String name;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void deposit(long acc,String name,float amt){
        if(this.accountNumber==acc && this.name==name){
            this.balance+=amt;
            System.out.println("withdraw successful");
            System.out.println("balance"+this.balance);
        }
    }
    public void withDraw(long acc,String name,float amt){
        if(this.accountNumber==acc && this.name==name){
            this.balance-=amt;
            System.out.println("withdraw successful");
            System.out.println("balance"+this.balance);
        }
    }

}
