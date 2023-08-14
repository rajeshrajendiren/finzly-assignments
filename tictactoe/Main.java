// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        Grid g1=new Grid();
        X x=new X();
        O o=new O();

        Scanner input=new Scanner(System.in);
        g1.prnt();
        System.out.println("BLOCK LETTER(XO)");

        for(int i=0;i<9;i++){
            int c=input.nextInt();
            String op= input.next();
            switch(c){
                case 1:
                    if(op.equals("X")){
                        g1.g[0][0]=x.putX();

                        winorlose(g1);
                    }
                    else{
                        g1.g[0][0]= o.putO();
                        winorlose(g1);

                    }
                    break;
                case 2:
                    if(op.equals("X")){
                        g1.g[0][1]=x.putX();
                        winorlose(g1);
                    }
                    else{
                        g1.g[0][1]= o.putO();
                      winorlose(g1);

                    }
                    break;
                case 3:
                    if(op.equals("X")){
                        g1.g[0][2]=x.putX();
                     winorlose(g1);
                    }
                    else{
                        g1.g[0][2]= o.putO();
                        winorlose(g1);

                    }
                    break;
                case 4:
                    if(op.equals("X")){
                        g1.g[1][0]=x.putX();
                        winorlose(g1);
                    }
                    else{
                        g1.g[1][0]= o.putO();
                        winorlose(g1);

                    }
                    break;
                case 5:
                    if(op.equals("X")){
                        g1.g[1][1]=x.putX();
                        winorlose(g1);
                    }
                    else{
                        g1.g[1][1]= o.putO();
                        winorlose(g1);

                    }
                    break;
                case 6:
                    if(op.equals("X")){
                        g1.g[1][2]=x.putX();
                        winorlose(g1);
                    }
                    else{
                        g1.g[1][2]= o.putO();
                        winorlose(g1);

                    }
                    break;
                case 7:
                    if(op.equals("X")){
                        g1.g[2][0]=x.putX();
                        winorlose(g1);
                    }
                    else{
                        g1.g[2][0]= o.putO();
                        winorlose(g1);

                    }
                    break;
                case 8:
                    if(op.equals("X")){
                        g1.g[2][1]=x.putX();
                        winorlose(g1);
                    }
                    else{
                        g1.g[2][1]= o.putO();
                        winorlose(g1);

                    }
                    break;
                case 9:
                    if(op.equals("X")){
                        g1.g[2][2]=x.putX();
                        winorlose(g1);
                    }
                    else{
                        g1.g[2][2]= o.putO();
                        winorlose(g1);

                    }
                    break;

            }

        }

    }
    static void winorlose(Grid g1){
        if((g1.g[0][0]=='X' && g1.g[1][1]=='X' && g1.g[2][2]=='X') || (g1.g[0][0]=='O' && g1.g[1][1]=='O' && g1.g[2][2]=='O')){
            System.out.println("win");
        }

        else if((g1.g[0][2]=='X' && g1.g[1][1]=='X' && g1.g[2][0]=='X') || (g1.g[0][2]=='O' && g1.g[1][1]=='O' && g1.g[2][0]=='O')){
            System.out.println("win");
        }
        else if(((g1.g[0][0]=='X'&&g1.g[0][1]=='X'&&g1.g[0][2]=='X')||(g1.g[1][0]=='X'&&g1.g[1][1]=='X'&&g1.g[1][2]=='X')||(g1.g[2][0]=='X'&&g1.g[2][1]=='X'&&g1.g[2][2]=='X')) ||((g1.g[0][0]=='O'&&g1.g[0][1]=='O'&&g1.g[0][2]=='O')||(g1.g[1][0]=='O'&&g1.g[1][1]=='O'&&g1.g[1][2]=='O')||(g1.g[2][0]=='O'&&g1.g[2][1]=='O'&&g1.g[2][2]=='O'))){
            System.out.println("win");
        }
        else if(((g1.g[0][0]=='X'&&g1.g[1][0]=='X'&&g1.g[2][0]=='X')||(g1.g[0][1]=='X'&&g1.g[1][1]=='X'&&g1.g[2][1]=='X')||(g1.g[0][2]=='X'&&g1.g[1][2]=='X'&&g1.g[2][2]=='X')) ||((g1.g[0][0]=='O'&&g1.g[1][0]=='O'&&g1.g[2][0]=='O')||(g1.g[0][1]=='O'&&g1.g[1][1]=='O'&&g1.g[2][1]=='O')||(g1.g[0][2]=='O'&&g1.g[1][2]=='O'&&g1.g[2][2]=='O'))){
            System.out.println("win");
        }
        else{
            g1.prnt();
        }


    }

    }
