package oddsum;
import java.util.Scanner;

public class OddSum {
    
    public static int oddSum(int x) {
        if (x == 1) {
            return 1;
            
        } else {
            int operand = oddSum(x - 1);
            int total = x + operand;
            if (x % 2 == 0) {
                total -= x;
            }
            return total;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int totalOdd = oddSum(number);
        System.out.println(totalOdd);
    }
    
}
