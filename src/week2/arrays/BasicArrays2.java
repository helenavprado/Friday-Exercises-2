package week2.arrays;
import java.util.Random;

public class BasicArrays2 {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int [] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            int randomNumber = RANDOM.nextInt(99) + 1;
            System.out.println(String.format("Slot %d contains a %d", i, randomNumber));
        }


    }
}
