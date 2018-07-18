package date;

public class Date {
    
    public static class DateClass {
        private int day;
        private String month;
        private int year;
        
        public DateClass() {
            this.day = 1;
            this.month = "January";
            this.year = 2000;
        }
        
        public DateClass(int inputDay, String inputMonth, int inputYear) {
            this.day = inputDay;
            this.month = inputMonth;
            this.year = inputYear;
        }
        
        public int getDay() {
            return this.day;
        }
        
        public String getMonth() {
            return this.month;
        }
        
        public int getYear() {
            return this.year;
        }
        
        public void setDay(int inputDay) {
            this.day = inputDay;
        }
        
        public void setMonth(String inputMonth) {
            this.month = inputMonth;
        }
        
        public void setYear(int inputYear) {
            this.year = inputYear;
        }
        
        public String printDate() {
            return this.day + " " + this.month + " " + this.year;
        }
        
    }

    public static void main(String[] args) {
        DateClass birthday = new DateClass(31, "August", 1995);
        System.out.println(birthday.printDate());
    }
    
}
