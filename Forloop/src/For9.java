public class For9 {
    public static void main(String[] args) {
        int sod=0,soe=0;
        for(int i=1;i<10;i++){
            if(i%2==0){
                soe=soe+i;
            }
            else{
                sod=sod+i;
            }

        }
        System.out.println("evensum"+soe);
        System.out.println("odd"+sod);
    }
}
