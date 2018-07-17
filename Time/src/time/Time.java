package time;

/**
 *
 * @author Chakrit Tokuhara
 */
public class Time {


    public static void main(String[] args) {
        int hour = 20;
        int minute = 55;
        int second = 30;
        int numOfSecond = (hour*60*60) + (minute*60) + second;
        int numOfSecondAllDay = 60*60*24;
        System.out.println("The number of seconds since midnight:");
        System.out.println(numOfSecond);
        System.out.println("Number of seconds remaning in the day:");
        System.out.println(numOfSecondAllDay - numOfSecond);
        System.out.println("Display the percentage of the day that has passed:");
        System.out.println((numOfSecond*100)/(numOfSecondAllDay*1.0));
    }
    
}
