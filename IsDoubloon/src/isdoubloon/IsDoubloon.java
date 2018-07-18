package isdoubloon;
import java.util.Scanner;

public class IsDoubloon {
    
    public static void isDoubloon(String x) {
        String y = x.toLowerCase();
        
        for (int i = 0; i < y.length(); i++) {
            int counter = 1;
            
            for (int j = 0; j < y.length(); j++) {
                
                if ((y.charAt(i) == y.charAt(j)) && (i != j)) {
                    counter++;
                }
            }
            
            if (counter != 2) {
                System.out.println(x + " is not Doubloon.");
                return;
            }
            
        }
        System.out.println(x + " is Doubloon.");
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert your word: ");
        String test = in.nextLine();
        
        isDoubloon(test);
    }
    
}
