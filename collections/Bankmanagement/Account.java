public class Account {
    String name;
    long acNo;
    String Acctype;
    double balance=0;

    public Account(String name, long acNo, String acctype) {
        this.name = name;
        this.acNo = acNo;
        this.Acctype = acctype;
    }
    public void deposit(int amt){
        this.balance+=amt;
    }
    public void withDraw(int amt){
        if(balance-amt!=0){
       this.balance-=amt;}
        else{
            System.out.println("you are trying to widthDraw excess amount");
        }
    }
    public void checkBalance(){
        System.out.println(this.balance);
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + this.name + '\'' +
                ", acNo=" + this.acNo +
                ", Acctype='" + this.Acctype + '\'' +
                ", balance=" + this.balance +
                ']';
    }
}
