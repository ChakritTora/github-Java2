package isabecedarian;
import java.util.Scanner;

public class IsAbecedarian {
    
    public static void isAbecedarian(String x) {
        for (int i = 0; i < x.length()-1; i++) {
            if (x.charAt(i) > x.charAt(i+1)) {
                System.out.println(x + " is not Abecedarian.");
                return;
            }
        }
        System.out.println(x + " is Abecadarian.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert your word: ");
        String test = in.nextLine();
        
        isAbecedarian(test);
    }
    
}
