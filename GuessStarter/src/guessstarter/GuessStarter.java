package guessstarter;
import java.util.Scanner;
import java.util.Random;

public class GuessStarter {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(Including both). Can you guess what it is?");
        
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        int guessNumber = in.nextInt();
        int offNumber = number - guessNumber;
        System.out.println("Your guess is: " + guessNumber);
        
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + offNumber);
    }
    
}
