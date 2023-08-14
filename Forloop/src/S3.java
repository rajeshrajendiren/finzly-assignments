public class S3 {
    public static void main(String[] args) {
        int c=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.print(-i);
            }
            else{
                System.out.print(i);
            }
        }
        System.out.println(c);
    }
}
