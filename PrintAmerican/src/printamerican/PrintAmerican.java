package printamerican;

public class PrintAmerican {
    
    public static void convertToAmerican(String dayInWeek, int day, String month, int year) {
        System.out.println(dayInWeek + ", " + month + " " + day + ", " + year);
    }
    
    public static void convertToEuropean(String dayInweek, int day, String month, int year) {
        System.out.println(dayInweek + " " + day + " " + month + " " + year);
    }

    public static void main(String[] args) {
        String dayInWeek = "Tuesday";
        int day = 17;
        String month = "July";
        int year = 2018;
        
        convertToAmerican(dayInWeek, day, month, year);
        convertToEuropean(dayInWeek, day, month, year);
    }
    
}
