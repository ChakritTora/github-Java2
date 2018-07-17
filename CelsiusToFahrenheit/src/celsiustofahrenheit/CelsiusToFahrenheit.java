package celsiustofahrenheit;
import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celcius = in.nextDouble();
   
        final double FAHRENHEIT = celcius * (9.0/5.0) + 32;
        
        System.out.printf("%.1f C = %.1f F\n", celcius, FAHRENHEIT);
    }
    
}
