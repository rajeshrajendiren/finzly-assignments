// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String s="educationr";
        String v="aeiou";
        int i,j,c=0;
        for(j=0;j<v.length();j++){
            for(i=0;i<s.length();i++) {
                if (v.charAt(j) == s.charAt(i)) {
                    c++;
                }


            }


            }
        if (c>=5) {
            System.out.println("contain"+c);
        } else {
            System.out.println("not contain");
        }

        }
    }
