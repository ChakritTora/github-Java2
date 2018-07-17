package bottlesofbeer;

public class BottlesOfBeer {
    
    public static void sing(int x) {
        if (x != 0) {
            System.out.println(x + " bottles of beer on the wall,");
            System.out.println(x + " bottles of beer,");
            System.out.println("ya’ take one down, ya’ pass it around,");
            sing(x - 1);
            
        } else {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("’cause there are no more bottles of beer on the wall!");
        }
    }

    public static void main(String[] args) {
        int bottlesOfBeer = 10;
        sing(bottlesOfBeer);
    }
    
}
