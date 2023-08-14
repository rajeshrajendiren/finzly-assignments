import java.util.Scanner;
public class Seriesrev {
	static boolean isIncreasing = true;
	

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    
    int currentNumber = 1;
    seriesrev(n,currentNumber);
}
public static void seriesrev(int n,int currentNumber) {
	while (currentNumber >= 1) {
        System.out.print(currentNumber + " ");
        
        if (currentNumber == n) {
            isIncreasing = false;
        }
        
        if (isIncreasing) {
            currentNumber++;
        } else {
            currentNumber--;
        }
    }

}}
