package istriangle;
import java.util.Scanner;

public class IsTriangle {
    
    public static boolean isTriangle(int x, int y, int z){
        if (x > y + z) {
            return false;
            
        } else if (y > x + z) {
            return false;

        } else if (z > x + y) {
            return false;
            
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int x, y , z;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        boolean tri = isTriangle(x, y, z);
        System.out.println(tri);
    }
    
}
