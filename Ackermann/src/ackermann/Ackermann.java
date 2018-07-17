package ackermann;
import java.util.Scanner;

public class Ackermann {
    
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
            
        } else if (m > 0 && n == 0) {
            int operand = ack(m - 1, 1);
            return operand;
            
        } else if (m > 0 && n > 0) {
            int operand = ack(m - 1, ack(m, n - 1));
            return operand;
            
        } else return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int result = ack(m, n);
        System.out.println(result);
    }
    
}
