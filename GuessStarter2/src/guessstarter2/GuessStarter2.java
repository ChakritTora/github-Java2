package guessstarter2;
import java.util.Scanner;
import java.util.Random;

public class GuessStarter2 {
    
    public static void guessNumber(int number) {
        int guessNum = randomNumber();
        if (guessNum > number) {
            System.out.println("Too high");
            guessNumber(number);
            
        } else if (guessNum < number) {
            System.out.println("Too low");
            guessNumber(number);
            
        } else {
            System.out.println("Correct!");
        }
    }
    
    public static int randomNumber() {
        Scanner in = new Scanner(System.in);
        int guessNum = in.nextInt();
        return guessNum;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        guessNumber(number);
    }
    
}
