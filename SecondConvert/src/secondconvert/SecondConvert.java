package secondconvert;
import java.util.Scanner;

public class SecondConvert {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalSecond = in.nextInt();
        final int SECOND_IN_HOUR = 3600;
        final int SECOND_IN_MINUTE = 60;
        
        int hour = totalSecond / SECOND_IN_HOUR;
        int minute = (totalSecond % SECOND_IN_HOUR)/ SECOND_IN_MINUTE;
        int second = (totalSecond % SECOND_IN_HOUR) % SECOND_IN_MINUTE;
        
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n", totalSecond, hour, minute, second);
    }
    
}
