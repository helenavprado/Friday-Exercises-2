package week2.arrays;
import java.util.Arrays;
import java.util.Random;

public class CopyingArrays {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int [] arrayOne = new int[10];
        int [] arrayTwo = new int[10];



        for (int i = 0; i < arrayOne.length; i++) {
            int randomNumber = RANDOM.nextInt(99) + 1;
            arrayOne[i] = randomNumber;

            arrayTwo[i] = randomNumber;



            if (i == arrayOne.length - 1) {
                arrayOne[i] = -7;
            }
        }

        System.out.println("Array 1: " + Arrays.toString(arrayOne));
        System.out.println("Array 2: " + Arrays.toString(arrayTwo));

    }
}
