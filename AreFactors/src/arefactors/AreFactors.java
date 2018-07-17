package arefactors;
import java.util.Scanner;

public class AreFactors {
    
    public static boolean isFactor(int number, int[] factor) {
        for (int i = 0; i < factor.length; i++) {
            if (number % factor[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert your number: ");
        int number = in.nextInt();
        int factor[] = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Insert your factor " + (i + 1) + ": ");
            factor[i] = in.nextInt();
        }
        
        boolean state = isFactor(number, factor);
        System.out.println(state);
    }
    
}
