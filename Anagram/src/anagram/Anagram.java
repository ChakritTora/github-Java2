package anagram;
import java.util.Scanner;

public class Anagram {
    
    public static void isAnagram(String x, String y) {
        int counter = 0;
        String newY = y;
        
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                if (x.charAt(i) == y.charAt(j) && i != j) {
                    y = y.replaceFirst(String.valueOf(y.charAt(j)), "=");
                    counter++;
                    continue;
                }
                
                //System.out.println(x + " " + y + " " + counter);
            }
        }
        
        if (counter != x.length()) {
            System.out.println(x + " and " + newY + " are NOT Anagram.");

        } else {
            System.out.println(x + " and " + newY + " are Anagram.");
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert your first line: ");
        String firstLine = in.nextLine();
        System.out.print("Insert your second line: ");
        String secondLine = in.nextLine();
        
        isAnagram(firstLine, secondLine);
    }
    
}
