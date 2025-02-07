
import java.util.Random;

public class pr6 {
    public static void main(String[] args) {
        Random r = new Random(1000);
        for (int i = 0; i < 100; i++) {
            System.out.print(" " + r.nextInt(4));
        }
    }
    
}